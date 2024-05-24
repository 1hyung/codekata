SELECT @NEWUSER2021 := 
    COUNT(*) 
    FROM user_info 
    WHERE YEAR(joined) = 2021;

SELECT
    YEAR(sales_date) AS year,
    MONTH(sales_date) AS month,
    COUNT(DISTINCT user_id) AS puchased_users,
    ROUND(COUNT(DISTINCT user_id) / @NEWUSER2021, 1) AS puchased_ratio
FROM online_sale
NATURAL JOIN user_info
WHERE YEAR(joined) = 2021
GROUP BY year, month
ORDER BY year, month