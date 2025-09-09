-- 상품 별 오프라인 매출 구하기
-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성
-- 결과는 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 정렬
SELECT
    P.PRODUCT_CODE, -- 상품코드
    SUM(P.PRICE * OS.SALES_AMOUNT) AS SALES -- 매출액
FROM
    PRODUCT P INNER JOIN OFFLINE_SALE OS ON P.PRODUCT_ID = OS.PRODUCT_ID -- 오프라인 매출 구하기 위해 INNER JOIN
GROUP BY
    P.PRODUCT_CODE -- 상품코드 그룹핑
ORDER BY
    SALES DESC, P.PRODUCT_CODE ASC; -- 매출액을 기준으로 내림차순 정렬, 매출액이 같다면 상품코드를 기준으로 오름차순 정렬