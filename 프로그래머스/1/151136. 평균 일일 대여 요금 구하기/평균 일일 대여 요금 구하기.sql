-- SUV 차량들의 평균 일일 대여 요금 구하기 (소수 첫 번째 자리에서 반올림)
SELECT 
    ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE  -- 평균값을 소수 첫 번째 자리에서 반올림
FROM 
    CAR_RENTAL_COMPANY_CAR
WHERE 
    CAR_TYPE = 'SUV';  -- 자동차 종류가 SUV인 데이터만 선택