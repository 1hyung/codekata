-- 동물 보호소에 가장 먼저 들어온 동물은 언제 들어왔는지 조회하는 SQL 문
SELECT 
    MIN(DATETIME) AS '시간' -- 보호 시작일의 최솟값을 조회
FROM
    ANIMAL_INS; -- 데이터를 조회할 테이블 