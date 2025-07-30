-- 동물의 수 구하기 
-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문을 작성
SELECT
    count(*) as count -- 동물의 수 구하기 
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블 
    