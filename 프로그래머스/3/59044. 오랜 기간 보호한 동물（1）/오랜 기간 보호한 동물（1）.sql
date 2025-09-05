-- 오랜 기간 보호한 동물(1)
-- 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성
-- 결과는 보호 시작일 순으로 조회
SELECT
    AI.NAME, -- 보호소에 있는 동물 이름
    AI.DATETIME -- 보호시작일
FROM
    ANIMAL_INS AI LEFT JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID -- LEFT JOIN으로 조건 활용
WHERE 
    AO.ANIMAL_ID IS NULL -- 입양을 간 동물들이 AO니까 NULL이어야 함
ORDER BY
    AI.DATETIME ASC -- 보호시작일을 기준으로 오름차순
LIMIT 3;