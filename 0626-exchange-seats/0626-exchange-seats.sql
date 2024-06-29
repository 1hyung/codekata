WITH cte_t AS(
        SELECT *
                , COUNT(*) OVER () as tot
        FROM seat
)
SELECT CASE
            WHEN MOD(id, 2) = 1 AND id <> tot THEN id + 1
            WHEN MOD(id, 2) = 1 AND id = tot THEN id
            ELSE id - 1
        END as id
        , student
FROM cte_t
ORDER BY id