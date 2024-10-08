SELECT 
    UGU.USER_ID, 
    UGU.NICKNAME, 
    CONCAT(UGU.CITY, ' ', UGU.STREET_ADDRESS1, ' ', UGU.STREET_ADDRESS2) AS 전체주소,
    CONCAT(LEFT(UGU.TLNO, 3), '-', SUBSTRING(UGU.TLNO, 4, 4), '-', RIGHT(UGU.TLNO, 4)) AS 전화번호
FROM 
    USED_GOODS_USER UGU
JOIN 
    (SELECT WRITER_ID, COUNT(*) AS POST_COUNT
     FROM USED_GOODS_BOARD
     GROUP BY WRITER_ID
     HAVING COUNT(*) >= 3) UGB
ON 
    UGU.USER_ID = UGB.WRITER_ID
ORDER BY 
    UGU.USER_ID DESC;
