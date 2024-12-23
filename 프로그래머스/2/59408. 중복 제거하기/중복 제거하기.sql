-- 중복되지 않은 이름이 존재하는 동물 보호소의 고유한 이름 개수 조회
SELECT
    COUNT(DISTINCT NAME) AS count -- 고유한 이름의 개수를 계산
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블 
WHERE 
    NAME IS NOT NULL; -- 이름이 NULL이 아닌 경우만 선택