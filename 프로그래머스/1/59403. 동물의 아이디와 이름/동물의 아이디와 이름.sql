-- 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회하는 SQL문
SELECT 
    ANIMAL_ID, -- 동물의 아이디 
    NAME -- 동물의 이름
FROM 
    ANIMAL_INS -- 데이터를 가져올 테이블 
ORDER BY
    ANIMAL_ID ASC; -- ANIMAL_ID 기준으로 오름차순 정렬
