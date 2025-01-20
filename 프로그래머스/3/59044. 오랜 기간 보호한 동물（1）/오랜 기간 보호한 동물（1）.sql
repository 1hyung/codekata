-- 입양을 가지 못한 동물 중 가장 오래 보호된 동물 3마리의 이름과 보호 시작일 조회
SELECT
    INS.NAME,         -- 동물 이름
    INS.DATETIME      -- 보호 시작일
FROM
    ANIMAL_INS INS    -- 보호소에 들어온 동물 정보
LEFT JOIN
    ANIMAL_OUTS OUTS  -- 보호소에서 입양 간 동물 정보
ON
    INS.ANIMAL_ID = OUTS.ANIMAL_ID -- ANIMAL_ID로 두 테이블을 연결
WHERE
    OUTS.ANIMAL_ID IS NULL         -- 입양 가지 않은 동물 필터링
ORDER BY
    INS.DATETIME ASC               -- 보호 시작일 기준 오름차순 정렬
LIMIT 3;                           -- 가장 오래된 동물 3마리만 조회