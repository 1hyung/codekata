-- 동물 보호소에 들어온 동물의 수를 조회
SELECT
    COUNT(ANIMAL_ID) AS count -- ANIMAL_ID을 세어 동물 수 계산
FROM
    ANIMAL_INS; -- 데이터를 조회할 테이블 