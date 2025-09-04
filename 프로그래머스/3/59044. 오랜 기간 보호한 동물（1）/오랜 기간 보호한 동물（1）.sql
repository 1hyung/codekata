-- 오랜 기간 보호한 동물(1)
-- 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성
-- 결과는 보호 시작일 순으로 조회
SELECT
    AI.NAME,
    AI.DATETIME
FROM
    ANIMAL_INS AI LEFT JOIN  ANIMAL_OUTS AO ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE   
    AO.ANIMAL_ID IS NULL
ORDER BY
    DATETIME
LIMIT 3;