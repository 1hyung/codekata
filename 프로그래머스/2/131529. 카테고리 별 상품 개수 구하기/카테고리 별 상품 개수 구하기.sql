-- 카테고리 별 상품 개수 구하기
-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문을 작성
-- 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬
SELECT
    SUBSTRING(PRODUCT_CODE, 1, 2) AS CATEGORY, -- 상품 카테고리 코드 앞 2자리
    COUNT(PRODUCT_ID) -- 카테고리별 상품 개수
FROM 
    PRODUCT -- 데이터를 조회할 테이블
GROUP BY
    SUBSTRING(PRODUCT_CODE, 1, 2) -- 카테고리 코드별 그룹화
ORDER BY
    CATEGORY; -- 카테고리 코드를 기준으로 오름차순 정렬 