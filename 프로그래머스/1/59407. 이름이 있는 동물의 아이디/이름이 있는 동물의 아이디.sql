-- 이름이 있는 동물의 ID를 오름차순으로 조회하는 SQL문
SELECT 
    ANIMAL_ID  -- 동물의 ID를 선택
FROM 
    ANIMAL_INS  -- ANIMAL_INS 테이블에서
WHERE 
    NAME IS NOT NULL  -- 이름이 NULL이 아닌 경우만 선택
ORDER BY 
    ANIMAL_ID ASC;  -- 동물의 ID를 기준으로 오름차순 정렬