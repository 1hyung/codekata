-- 헤비 유저가 소유한 장소
SELECT 
    ID, 
    NAME, 
    HOST_ID
FROM 
    PLACES
WHERE 
    HOST_ID IN (
        SELECT 
            HOST_ID
        FROM 
            PLACES
        GROUP BY 
            HOST_ID
        HAVING 
            COUNT(*) >= 2 -- 등록된 공간이 2개 이상인 경우 "헤비 유저"
    )
ORDER BY 
    ID ASC; -- ID를 기준으로 오름차순 정렬