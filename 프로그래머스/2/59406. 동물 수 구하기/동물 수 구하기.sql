-- 동물 보호소에 들어온 동물의 수를 조회
SELECT
    COUNT(*) AS count -- ANIMAL_ID 중 NULL값이 있을 수 있어서 모든 행 조회
FROM
    ANIMAL_INS; -- 데이터를 조회할 테이블