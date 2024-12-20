SELECT 
    COUNT(DISTINCT NAME) AS count  -- 중복되지 않는 이름의 개수를 셉니다.
FROM 
    ANIMAL_INS  -- 데이터를 가져올 테이블
WHERE 
    NAME IS NOT NULL;  -- 이름이 NULL이 아닌 경우만 선택