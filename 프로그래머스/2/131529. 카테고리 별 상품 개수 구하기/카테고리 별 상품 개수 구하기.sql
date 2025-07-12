-- 카테고리 별 상품 개수 구하기
-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문을 작성
-- 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬
SELECT
    substring(PRODUCT_CODE, 1 ,2) as CATEGORY, -- 상품 코드의 앞 2자리를 카테고리로 추출
    count(*) as PRODUCTS -- 카테고리 별 상품 개수를 계산
from
    PRODUCT -- 카테고리 별 상품 개수를 계산
group by 
    substring(PRODUCT_CODE, 1 ,2) -- 카테고리 코드로 그룹화
order by 
    PRODUCT_CODE asc; -- 카테고리 코드를 기준으로 오름차순 정렬