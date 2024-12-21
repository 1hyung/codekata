-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 오름차순 정렬 조회하는 SQL 문
SELECT
    ANIMAL_ID -- ANIMAL_ID만 선택 출력
FROM 
    ANIMAL_INS -- ANIMAL_INS 테이블에서 조회
WHERE 
    NAME IS NOT NULL -- 조건 : 이름이 존재하는 행만 필터링
ORDER BY 
    ANIMAL_ID ASC; -- ANIMAL_ID 기준으로 오름차순 정렬