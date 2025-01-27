-- 주문 정보와 출고 여부 조회
SELECT 
    ORDER_ID,                            -- 주문 ID
    PRODUCT_ID,                          -- 제품 ID
    DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE, -- 날짜를 YYYY-MM-DD 형식으로 변환
    CASE 
        WHEN OUT_DATE IS NULL THEN '출고미정'                  -- 출고일이 NULL인 경우
        WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'         -- 2022년 5월 1일 이전 또는 같은 경우
        ELSE '출고대기'                                       -- 2022년 5월 1일 이후
    END AS 출고여부
FROM 
    FOOD_ORDER
ORDER BY 
    ORDER_ID ASC;                       -- 주문 ID 기준으로 오름차순 정렬