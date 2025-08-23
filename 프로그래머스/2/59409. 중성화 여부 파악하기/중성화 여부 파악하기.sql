-- 중성화 여부 파악하기
-- 보호소의 동물이 중성화되었는지 아닌지 파악
--  중성화된 동물은 SEX_UPON_INTAKE 컬럼에 'Neutered' 또는 'Spayed'라는 단어
-- 동물의 아이디와 이름, 중성화 여부를 아이디 순으로 조회하는 SQL문을 작성
--  중성화가 되어있다면 'O', 아니라면 'X'라고 표시
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME, -- 동물의 이름
    CASE WHEN -- 중성화된 동물 o, x 표현
        SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE '%Spayed%'
        THEN 'O'
        ELSE 'X'
        END AS '중성화'
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    ANIMAL_ID ASC; -- 아이디 오름차순 정렬