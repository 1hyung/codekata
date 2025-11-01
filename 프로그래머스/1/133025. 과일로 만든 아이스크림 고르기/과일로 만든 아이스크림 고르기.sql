-- 과일로 만든 아이스크림 고르기
-- 상반기 아이스크림 총주문량이 3,000보다 높으면서 
-- 아이스크림의 주 성분이 과일인 아이스크림의 맛을 
-- 총주문량이 큰 순서대로 조회하는 SQL 문을 작성
SELECT
    FH.FLAVOR
FROM 
    FIRST_HALF FH INNER JOIN ICECREAM_INFO II ON FH.FLAVOR = II.FLAVOR -- 두 테이블 다 값이 있어야 하니까 INNER JOIN
WHERE
    II.INGREDIENT_TYPE = 'fruit_based'  AND -- 주 성분이 과일인 아이스크림 맛 필터링
    FH.TOTAL_ORDER > 3000 -- 총 주문량 3000 이상 필터링
ORDER BY
    TOTAL_ORDER DESC; -- 총 주문량이 큰 순서대로 정렬