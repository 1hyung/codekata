-- 상품코드 별 매출액(판매가 * 판매량) 합계를 계산하고 정렬
SELECT
    P.PRODUCT_CODE,                         -- 상품 코드
    SUM(P.PRICE * O.SALES_AMOUNT) AS SALES -- 매출액 (판매가 * 판매량)
FROM
    PRODUCT P
JOIN
    OFFLINE_SALE O
ON
    P.PRODUCT_ID = O.PRODUCT_ID             -- 상품 ID로 두 테이블을 연결
GROUP BY
    P.PRODUCT_CODE                          -- 상품 코드 별로 그룹화
ORDER BY
    SALES DESC,                             -- 매출액을 기준으로 내림차순 정렬
    P.PRODUCT_CODE ASC;                     -- 매출액이 같다면 상품코드를 기준으로 오름차순 정렬