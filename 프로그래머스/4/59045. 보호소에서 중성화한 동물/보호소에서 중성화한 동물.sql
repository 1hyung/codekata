-- 보호소에서 중성화 수술을 받은 동물 조회
SELECT 
    ANIMAL_INS.ANIMAL_ID,    -- 동물의 아이디
    ANIMAL_INS.ANIMAL_TYPE,  -- 동물의 종류 (예: 개, 고양이 등)
    ANIMAL_INS.NAME          -- 동물의 이름
FROM 
    ANIMAL_INS
JOIN 
    ANIMAL_OUTS 
    ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID -- 입양된 동물 연결 (ANIMAL_ID 기준)
WHERE 
    -- 보호소에 들어올 당시 중성화되지 않은 동물
    ANIMAL_INS.SEX_UPON_INTAKE LIKE '%Intact%' 
    AND 
    (
        -- 보호소에서 나갈 당시 중성화된 동물 (Spayed 또는 Neutered)
        ANIMAL_OUTS.SEX_UPON_OUTCOME LIKE '%Spayed%' 
        OR ANIMAL_OUTS.SEX_UPON_OUTCOME LIKE '%Neutered%'
    )
ORDER BY 
    ANIMAL_INS.ANIMAL_ID ASC; -- 아이디를 기준으로 오름차순 정렬