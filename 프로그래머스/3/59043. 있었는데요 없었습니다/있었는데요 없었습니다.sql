-- 있었는데요 없었습니다
-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성
-- 결과는 보호 시작일이 빠른 순으로 조회
SELECT
    AI.ANIMAL_ID, -- 동물의 아이디
    AI.NAME -- 동물의 이름
FROM
    ANIMAL_INS AI LEFT JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE
    AI.DATETIME > AO.DATETIME -- 보호 시작일보다 입양일이 더 빠른 동물 필터링
ORDER BY
    AI.DATETIME ASC; -- 결과는 보호 시작일이 빠른 순으로 조회