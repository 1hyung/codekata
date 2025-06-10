-- 이름에 el이 들어가는 동물 찾기 
-- 동물 보호소에 들어온 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 SQL문을 작성
-- 결과는 이름 순으로 조회해주세요. 단, 이름의 대소문자는 구분하지 않습니다.
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME -- 동물의 이름
FROM 
    ANIMAL_INS -- 데이터를 조회하는 테이블 
WHERE 
    ANIMAL_TYPE = 'Dog' AND -- 동물의 종류가 개인 경우
    NAME LIKE '%el%' -- 이름에 'el'이 포함된 경우
ORDER BY
    NAME ASC; -- 이름 순으로 오름차순 정렬