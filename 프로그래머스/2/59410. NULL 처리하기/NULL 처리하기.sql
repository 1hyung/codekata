-- 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회하는 SQL문
-- 프로그래밍을 모르는 사람들은 NULL이라는 기호를 모르기 때문에, 이름이 없는 동물의 이름은 "No name"으로 표시
SELECT
    ANIMAL_TYPE, -- 동물의 종
    COALESCE(NAME, 'No name') AS NAME, -- 이름이 NULL이면 "No name"으로 표시
    SEX_UPON_INTAKE -- 성별 및 중성화 여부
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블 
ORDER BY
    ANIMAL_ID; -- 아이디 순으로 정렬