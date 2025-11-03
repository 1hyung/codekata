-- 재구매가 일어난 상품과 회원 리스트 구하기
-- 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여, 재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL문을 작성
-- 결과는 회원 ID를 기준으로 오름차순 정렬해주시고 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬
SELECT
    USER_ID, -- 회원 ID
    PRODUCT_ID -- 상품 ID
FROM
    ONLINE_SALE -- 데이터를 조회할 테이블
GROUP BY
    USER_ID, PRODUCT_ID -- USER_ID, PRODUCT_ID로 그룹핑 → 회원+상품 단위로 묶임
HAVING 
    COUNT(*) >= 2 -- 재구매 조건 필터링
ORDER BY
    USER_ID ASC, -- 회원 ID 오름차순 정렬
    PRODUCT_ID DESC; -- 회원 아이디가 같다면 상품 ID 기준 내림차순 정렬 