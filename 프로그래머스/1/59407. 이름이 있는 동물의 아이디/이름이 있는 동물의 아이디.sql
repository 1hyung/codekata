-- 이름이 있는 동물의 아이디 
-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성
-- ID는 오름차순 정렬
SELECT
    ANIMAL_ID -- 동물의 ID
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE
    NAME IS NOT NULL -- 이름이 있는 동물만 필터링
ORDER BY
    ANIMAL_ID ASC; -- ID 오름차순 정렬