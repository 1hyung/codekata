-- FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL문
SELECT
    PRODUCT_ID, -- 식품 ID
    PRODUCT_NAME, -- 식품 이름
    PRODUCT_CD, -- 식품 코드 
    CATEGORY, -- 식품 분류
    PRICE -- 식품 가격
FROM
    FOOD_PRODUCT -- 데이터를 조회할 테이블
ORDER BY
    PRICE DESC -- 가격 내림차순 정렬
LIMIT 1; -- 가장 비싼 식품 하나만 선택