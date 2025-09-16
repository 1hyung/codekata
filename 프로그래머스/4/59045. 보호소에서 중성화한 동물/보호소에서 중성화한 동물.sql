-- 보호소에서 중성화한 동물
-- 보호소에 들어올 당시에는 중성화되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성
SELECT
    AI.ANIMAL_ID, -- 동물의 아이디
    AI.ANIMAL_TYPE, -- 생물 종
    AI.NAME -- 이름
FROM 
    ANIMAL_INS AI INNER JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID -- AI, AO 교집합
WHERE
    AI.SEX_UPON_INTAKE LIKE '%Intact%' AND (AO.SEX_UPON_OUTCOME LIKE '%Spayed%' OR AO.SEX_UPON_OUTCOME LIKE '%Neutered%') -- AI Intact이고 AO가 Spayed거나 Neutered
ORDER BY
    AI.ANIMAL_ID ASC; -- ANIMAL_ID 아이디 순으로 조회 