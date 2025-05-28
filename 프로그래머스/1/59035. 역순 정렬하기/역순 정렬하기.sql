-- 동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 ANIMAL_ID 역순으로 조회하는 SQL문을 작성 
SELECT
    NAME, -- 동물 이름
    DATETIME -- 보호 시작일
FROM 
    ANIMAL_INS -- 동물의 정보를 담은 데이터 테이블
ORDER BY 
    ANIMAL_ID DESC; -- ANIMAL_ID를 기준으로 내림차순 정렬