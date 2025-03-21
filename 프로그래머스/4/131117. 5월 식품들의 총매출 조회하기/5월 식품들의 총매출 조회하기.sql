-- 2022년 5월에 생산된 식품들의 총매출 조회
SELECT 
    p.PRODUCT_ID, 
    p.PRODUCT_NAME, 
    SUM(o.AMOUNT * p.PRICE) AS TOTAL_SALES
FROM FOOD_PRODUCT p
JOIN FOOD_ORDER o 
    ON p.PRODUCT_ID = o.PRODUCT_ID
WHERE o.PRODUCE_DATE BETWEEN '2022-05-01' AND '2022-05-31'  -- 2022년 5월에 생산된 제품만 필터링
GROUP BY p.PRODUCT_ID, p.PRODUCT_NAME  -- 식품별로 총매출 계산
ORDER BY TOTAL_SALES DESC, p.PRODUCT_ID ASC;  -- 총매출 내림차순, 동일할 경우 PRODUCT_ID 오름차순 정렬