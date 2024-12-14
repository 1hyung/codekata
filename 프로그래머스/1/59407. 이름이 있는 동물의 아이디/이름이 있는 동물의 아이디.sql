-- 이름이 있는 동물의 ID를 오름차순으로 조회
-- ANIMAL_INS 테이블에서 ANIMAL_ID를 조회
SELECT 
    ANIMAL_ID -- 동물의 ID를 선택
FROM 
    ANIMAL_INS -- ANIMAL_INS 테이블에서 (데이터를 가져올 테이블)
WHERE 
    NAME IS NOT NULL -- 조건 : NAME이 NULL이 아닌 동물만 조회
ORDER BY
    ANIMAL_ID ASC; -- ANIMAL_ID을 기준으로 오름차순 정렬