-- 이름이 없는 동물의 아이디
-- 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성
-- ID는 오름차순 정렬
SELECT
    ANIMAL_ID -- 동물의 ID
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE
    NAME IS NULL -- 이름이 없는 동물의 아이디 필터링
ORDER BY
    ANIMAL_ID ASC; -- 동물의 ID 오름차순 정렬