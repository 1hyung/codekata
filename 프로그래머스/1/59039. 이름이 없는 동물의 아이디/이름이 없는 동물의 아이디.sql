-- 동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문
--  ID는 오름차순 정렬
SELECT
    ANIMAL_ID -- 동물 ID
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE
    NAME IS NULL -- 이름이 NULL인 조건 필터링
ORDER BY
    ANIMAL_ID ASC; -- ID를 기준으로 오름차순 정렬