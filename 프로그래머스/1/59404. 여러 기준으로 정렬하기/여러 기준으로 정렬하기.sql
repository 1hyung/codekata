-- 동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 
-- 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME, -- 동물의 이름
    DATETIME -- 보호 시작일
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    NAME ASC, -- 이름 순 정렬
    DATETIME DESC ; -- 이름이 같을 경우 보호 시작일을 내림차순 정렬 