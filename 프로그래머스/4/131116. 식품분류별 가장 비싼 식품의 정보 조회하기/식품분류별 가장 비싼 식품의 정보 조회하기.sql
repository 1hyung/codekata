-- 특정 카테고리 내에서 가격이 가장 비싼 식품 정보 조회
-- 가격(PRICE) 기준 내림차순 정렬
SELECT 
    f.CATEGORY, 
    f.PRICE AS MAX_PRICE, 
    f.PRODUCT_NAME
FROM FOOD_PRODUCT f
JOIN (
    -- 각 카테고리별 최고 가격을 구하는 서브쿼리
    SELECT 
        CATEGORY, 
        MAX(PRICE) AS MAX_PRICE
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ('과자', '국', '김치', '식용유') -- 특정 카테고리 필터링
    GROUP BY CATEGORY
) max_price_table
ON f.CATEGORY = max_price_table.CATEGORY 
AND f.PRICE = max_price_table.MAX_PRICE
WHERE f.CATEGORY IN ('과자', '국', '김치', '식용유') -- 특정 카테고리 필터링
ORDER BY f.PRICE DESC;