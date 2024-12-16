-- 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL문 작성 
-- 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 침.
SELECT
    COUNT (DISTINCT NAME) AS count -- 중복되지 않는 이름의 개수를 계산
FROM 
    ANIMAL_INS -- 데이터를 가져올 테이블
WHERE 
    NAME IS NOT NULL; -- 이름이 NULL이 아닌 데이터만 포함