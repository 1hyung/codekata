-- 입양 기록은 있지만 보호소 입소 기록이 없는 동물 조회
SELECT 
    o.ANIMAL_ID, 
    o.NAME
FROM ANIMAL_OUTS o
LEFT JOIN ANIMAL_INS i 
    ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE i.ANIMAL_ID IS NULL  -- 보호소 입소 기록이 없는 동물 필터링
ORDER BY o.ANIMAL_ID ASC;  -- ID 기준 오름차순 정렬