-- 주문량이 많은 아이스크림들 조회하기
WITH COMBINED_ORDERS AS (
    SELECT
        F.FLAVOR,                                   -- 아이스크림 맛
        F.TOTAL_ORDER AS FIRST_HALF_ORDER,         -- 상반기 총 주문량
        COALESCE(SUM(J.TOTAL_ORDER), 0) AS JULY_ORDER -- 7월 총 주문량 (NULL 값은 0으로 대체)
    FROM
        FIRST_HALF F
    LEFT JOIN
        JULY J
    ON
        F.FLAVOR = J.FLAVOR                        -- 맛 기준으로 JOIN
    GROUP BY
        F.FLAVOR, F.TOTAL_ORDER                    -- 상반기 데이터 기준 그룹화
)
SELECT
    FLAVOR                                         -- 최종적으로 출력할 아이스크림 맛
FROM
    COMBINED_ORDERS
ORDER BY
    (FIRST_HALF_ORDER + JULY_ORDER) DESC           -- 상반기 + 7월 총 주문량 기준 내림차순 정렬
LIMIT 3;                                          -- 상위 3개 맛 출력