-- 이름에 el이 들어가는 동물 찾기
-- 동물 보호소에 들어온 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 SQL문을 작성
--  결과는 이름 순으로 조회
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME -- 이름
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE 
    ANIMAL_TYPE = 'Dog' AND NAME LIKE '%el%' -- 개 그리고 이름에 el가 들어갈 것 
ORDER BY
    NAME ASC; -- 이름순 조회