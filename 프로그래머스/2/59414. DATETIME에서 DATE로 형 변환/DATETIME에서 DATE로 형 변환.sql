-- DATETIME에서 DATE로 형 변환
-- ANIMAL_INS 테이블에 등록된 모든 레코드에 대해, 각 동물의 아이디와 이름, 들어온 날짜(시각(시-분-초)을 제외한 날짜(년-월-일)만 보여주세요.)를 조회하는 SQL문을 작성해주세요. 이때 결과는 아이디 순으로 조회
SELECT
    ANIMAL_ID, -- 동물의 ID
    NAME, -- 동물의 이름
    DATE_FORMAT(DATETIME, '%Y-%m-%d') AS 날짜 -- DATE_FORMAT을 활용해서 원하는 형식으로 변환
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    ANIMAL_ID ASC; --  아이디 순으로 오름차순 정렬