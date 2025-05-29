-- 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문
-- 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.
SELECT
    COUNT(DISTINCT NAME) AS count -- 중복되지 않은 이름의 수
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE 
    NAME IS NOT NULL; -- 이름이 NULL이 아닌 경우