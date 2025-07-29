-- 동물의 아이디와 이름
-- 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회하는 SQL문을 작성
SELECT
    ANIMAL_ID, -- 동물의 아이디 
    NAME -- 이름
FROM    
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    ANIMAL_ID ASC; -- ANIMAL_ID순으로 조회