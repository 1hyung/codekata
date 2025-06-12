-- 가장 비싼 상품 구하기
-- 판매 중인 상품 중 가장 높은 판매가를 출력하는 SQL문
-- 컬럼명은 MAX_PRICE
SELECT
    MAX(PRICE) AS MAX_PRICE -- 가장 비싼 판매가를 MAX_PRICE로 지정
FROM 
    PRODUCT; -- 데이터를 조회할 테이블