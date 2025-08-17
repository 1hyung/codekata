-- 가격이 제일 비싼 식품의 정보 출력하기
-- FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL문을 작성
SELECT
    PRODUCT_ID, -- 식품의 ID
    PRODUCT_NAME, -- 식품의 이름
    PRODUCT_CD, -- 식품 코드
    CATEGORY, -- 식품 분류
    PRICE -- 가격
FROM
    FOOD_PRODUCT -- 데이터를 조회할 테이블
WHERE
    PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT); -- 서브쿼리로 가장 비싼 가격을 먼저 조회