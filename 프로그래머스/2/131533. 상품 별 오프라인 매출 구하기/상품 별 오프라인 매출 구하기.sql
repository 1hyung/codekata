-- 상품 별 오프라인 매출 구하기
-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성
-- 결과는 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 정렬
SELECT
    P.PRODUCT_CODE, -- 상품코드
    SUM(P.PRICE * OS.SALES_AMOUNT) AS SALES -- 매출액
FROM 
    PRODUCT P INNER JOIN OFFLINE_SALE OS ON OS.PRODUCT_ID = P.PRODUCT_ID -- 프로덕트 테이블을 기준으로 LEFT JOIN
GROUP BY
    PRODUCT_CODE -- PRODUCT_CODE 별 매출액을 구해야 하니 그룹핑
ORDER BY
    SALES DESC, PRODUCT_CODE ASC; -- 결과는 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 정렬