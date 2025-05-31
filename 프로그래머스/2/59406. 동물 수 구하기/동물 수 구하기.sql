-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문
SELECT
    COUNT(*) AS count -- ANIMAL_ID 중 NULL값이 있을 수 있어서 모든 행을 조회
FROM 
    ANIMAL_INS; -- 데이터를 조회할 테이블