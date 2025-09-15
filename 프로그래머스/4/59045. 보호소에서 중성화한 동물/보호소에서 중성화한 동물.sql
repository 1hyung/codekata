-- 보호소에서 중성화한 동물
-- 보호소에서 중성화 수술을 거친 동물 정보를 알아보려 함
-- 보호소에 들어올 당시에는 중성화되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성
SELECT
    AI.ANIMAL_ID,
    AI.ANIMAL_TYPE,
    AI.NAME
FROM 
    ANIMAL_INS AI INNER JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE 
    AI.SEX_UPON_INTAKE != AO.SEX_UPON_OUTCOME
ORDER BY
    AI.ANIMAL_ID ASC;