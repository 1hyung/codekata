-- 성분으로 구분한 아이스크림 총 주문량
-- 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성
-- 주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정
SELECT
    II.INGREDIENT_TYPE, -- 각 성분 타입 그룹
    SUM(FH.TOTAL_ORDER) AS TOTAL_ORDER -- 총 주문량
FROM 
    FIRST_HALF FH INNER JOIN ICECREAM_INFO II ON FH.FLAVOR = II.FLAVOR -- 둘 다 값이 있어야 하니까 INNER JOIN
GROUP BY
    II.INGREDIENT_TYPE -- 각 성분 타입 그룹핑
ORDER BY
    TOTAL_ORDER ASC; -- 총 주문량 작은 순서대로 정렬