-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문
--  상품 카테고리 코드를 기준으로 오름차순 정렬
SELECT
    LEFT(PRODUCT_CODE, 2) AS CATEGORY, -- 상품 코드의 앞 2자리를 카테고리로 추출
    COUNT(*) AS PRODUCTS -- 카테고리 별 상품 개수를 계산
FROM
    PRODUCT -- 데이터를 조회할 테이블
GROUP BY 
    LEFT(PRODUCT_CODE, 2) -- 카테고리 코드로 그룹화
ORDER BY
    CATEGORY ASC; -- 카테고리 코드를 기준으로 오름차순 정렬