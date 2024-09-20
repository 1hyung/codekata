WITH value AS (
    SELECT 
        car.daily_fee,  -- 일일 대여 요금
        car.car_type,    -- 자동차 종류 (여기서는 '트럭')
        his.history_id,  -- 대여 기록 ID
        DATEDIFF(his.end_date, his.start_date) + 1 AS period,  -- 대여 기간(일수)
        CASE 
            -- 대여 기간에 따른 할인 정책 구분
            WHEN DATEDIFF(his.end_date, his.start_date) + 1 >= 90 THEN '90일 이상'
            WHEN DATEDIFF(his.end_date, his.start_date) + 1 >= 30 THEN '30일 이상'
            WHEN DATEDIFF(his.end_date, his.start_date) + 1 >= 7 THEN '7일 이상'
            ELSE 'NONE'  -- 할인 정책이 없는 경우
        END AS duration_type  -- 기간 종류에 따른 할인 정책 타입
    FROM 
        car_rental_company_rental_history AS his  -- 대여 기록 테이블
    INNER JOIN 
        car_rental_company_car AS car  -- 자동차 정보 테이블과 JOIN
    ON 
        car.car_id = his.car_id
    WHERE 
        car.car_type = '트럭'  -- 트럭에 대해서만 조회
)   
SELECT 
    value.history_id,  -- 대여 기록 ID
    ROUND(value.daily_fee * value.period * (100 - IFNULL(plan.discount_rate, 0)) / 100) AS FEE  -- 할인율 적용 후 대여 요금
FROM 
    value
LEFT JOIN 
    car_rental_company_discount_plan AS plan  -- 할인 정책 테이블과 JOIN
ON 
    plan.duration_type = value.duration_type 
    AND plan.car_type = value.car_type  -- 자동차 종류와 할인 기간에 맞는 할인 정책 적용
ORDER BY 
    FEE DESC,  -- 대여 요금을 기준으로 내림차순 정렬
    value.history_id DESC;  -- 대여 기록 ID 기준으로 내림차순 정렬
