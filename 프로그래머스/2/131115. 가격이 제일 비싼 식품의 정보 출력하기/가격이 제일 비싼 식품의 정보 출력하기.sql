-- 가격이 제일 비싼 식품의 정보 출력하기
-- 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL문을 작성
SELECT
    PRODUCT_ID, -- 식품 ID
    PRODUCT_NAME, -- 식품 이름
    PRODUCT_CD, -- 식품 코드
    CATEGORY, -- 식픔 분류
    PRICE -- 가격이 제일 비싼 식품 가격 
FROM
    FOOD_PRODUCT -- 데이터를 조회할 테이블
WHERE 
     PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT); -- 최고 가격과 같은 식품만 조회