-- 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 SQL문
-- 이름의 대소문자는 구분하지 않고 이름 순으로 조회
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME -- 동물의 이름
FROM
    ANIMAL_INS -- 데이터를 조회하는 테이블
WHERE 
    ANIMAL_TYPE = 'Dog' AND -- 동물의 종류가 개인 경우
    NAME LIKE '%el%' -- 이름에 'el'이 포함된 경우(LOWER() 함수는 문자열을 소문자로 변환하여 대소문자 구분 없이 검색, UPPER()도 사용 가능)
ORDER BY
    NAME ASC; -- 이름 순으로 오름차순 정렬