SELECT 
    P.ID,
    P.NAME,
    P.HOST_ID
FROM 
    PLACES P
WHERE 
    P.HOST_ID IN (
        SELECT 
            HOST_ID
        FROM 
            PLACES
        GROUP BY 
            HOST_ID
        HAVING 
            COUNT(*) >= 2 -- 두 개 이상의 공간을 등록한 호스트만 선택
    )
ORDER BY 
    P.ID; -- ID 기준으로 오름차순 정렬