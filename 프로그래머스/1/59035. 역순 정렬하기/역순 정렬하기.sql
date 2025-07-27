-- 역순 정렬하기 
-- 동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 SQL문을 작성
-- 결과는 ANIMAL_ID 역순
SELECT
    NAME, -- 동물의 이름
    DATETIME -- 보호 시작일
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    ANIMAL_ID DESC; -- ANIMAL_ID 역순