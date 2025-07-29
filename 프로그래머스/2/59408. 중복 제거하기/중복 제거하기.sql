-- 중복 제거하기 
-- 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문을 작성
-- 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 합침
SELECT
    count(distinct NAME) as count -- 중복되는 이름 제거
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블 
WHERE
    NAME IS NOT NULL -- NULL 제거 