-- DATETIME에서 DATE로 형 변환
-- 동물의 아이디와 이름, 들어온 날짜를 조회하는 SQL문을 작성
-- 결과는 아이디 순으로 조회
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME, -- 이름
    DATE_FORMAT(DATETIME, '%Y-%m-%d') AS '날짜' -- 들어온 날짜 형식 변경
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    ANIMAL_ID ASC; -- 아이디 순으로 조회