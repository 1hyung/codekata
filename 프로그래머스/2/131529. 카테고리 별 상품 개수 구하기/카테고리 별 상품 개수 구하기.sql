-- 카테고리 별 상품 개수 구하기
-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문
-- 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬
select
    left(PRODUCT_CODE, 2) as CATEGORY, -- 상품 코드 앞 2자리 카테고리 추출
    count(*) as PRODUCTS -- 카테고리별 상품 개수 계산
from
    PRODUCT -- 데이터를 조회할 테이블 
group by
    left(PRODUCT_CODE, 2) -- 카테고리 코드로 그룹화
order by   
    CATEGORY asc; -- 카테고리를 기준으로 오름차순 정렬