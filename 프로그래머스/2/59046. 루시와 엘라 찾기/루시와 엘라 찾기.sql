-- 루시와 엘라 찾기
-- 동물 보호소에 들어온 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty인 동물의 아이디와 이름, 성별 및 중성화 여부를 조회하는 SQL 문을 작성
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME, -- 이름
    SEX_UPON_INTAKE -- 중성화 여부
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE 
    NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty') -- 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty인 동물 조회
ORDER BY
    ANIMAL_ID ASC; -- 결과는 아이디 순 