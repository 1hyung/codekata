-- 어린 동물 찾기
-- 동물 보호소에 들어온 동물 중 젊은 동물1의 아이디와 이름을 조회하는 SQL 문을 작성
-- 결과는 아이디 순으로 조회
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME    -- 동물의 이름
FROM
   ANIMAL_INS   -- 데이터를 조회할 테이블
WHERE
    INTAKE_CONDITION != 'Aged' -- 나이든 동물 제외 필터링
ORDER BY
    ANIMAL_ID ASC;  --  아이디 순으로 오름차순 정렬