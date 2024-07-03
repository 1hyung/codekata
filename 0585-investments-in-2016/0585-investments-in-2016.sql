WITH cte_2015 AS
(
    SELECT tiv_2015, count(*) as tot
    FROM insurance
    GROUP BY tiv_2015
    HAVING count(*) >= 2
)
, cte_reg AS
(
    SELECT lat, lon, count(*) as reg
    FROM insurance
    GROUP BY lat, lon
    HAVING count(*) = 1
)
SELECT ROUND(SUM(tiv_2016), 2) as tiv_2016
FROM insurance
WHERE tiv_2015 IN (SELECT tiv_2015 FROM cte_2015)
AND (lat, lon) IN (SELECT lat, lon FROM cte_reg);
