-- 동물 보호소에 들어온 동물 중 젊은 동물1의 아이디와 이름을 아이디 순으로 조회하는 SQL 문
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME -- 동물의 이름
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블 
WHERE
    INTAKE_CONDITION != 'Aged' -- 나이가 많은 동물들 제외
ORDER BY
    ANIMAL_ID; -- 아이디를 오름차순으로 정렬