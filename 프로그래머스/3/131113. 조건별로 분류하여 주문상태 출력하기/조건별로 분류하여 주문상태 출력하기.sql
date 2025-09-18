-- 조건별로 분류하여 주문상태 출력하기
-- FOOD_ORDER 테이블에서 2022년 5월 1일을 기준으로 주문 ID, 제품 ID, 출고일자, 출고여부를 조회하는 SQL문을 작성
-- 출고여부는 2022년 5월 1일까지 출고완료로 이 후 날짜는 출고 대기로 미정이면 출고미정으로 출력
-- 결과는 주문 ID를 기준으로 오름차순 정렬
SELECT
    ORDER_ID,                            -- 주문 ID
    PRODUCT_ID,                          -- 제품 ID
    DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE, -- 출고일자
    CASE
        WHEN OUT_DATE IS NULL THEN '출고미정'
        WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'
        WHEN OUT_DATE > '2022-05-01' THEN '출고대기'
    END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID ASC;