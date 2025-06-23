-- 중성화된 동물 파악하기
-- 중성화된 동물은 SEX_UPON_INTAKE 컬럼에 'Neutered' 또는 'Spayed'라는 단어가 들어있음
-- 동물의 아이디와 이름, 중성화 여부를 아이디 순으로 조회하는 SQL문
-- 중성화가 되어있다면 'O', 아니라면 'X'라고 표시
SELECT
    ANIMAL_ID, -- 동물의 아이디
    NAME, -- 이름
    CASE 
        WHEN SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE  '%Spayed%'
        THEN 'O' -- 중성화된 경우
        ELSE 'X' -- 중성화되지 않은 경우
    END AS 중성화
FROM
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    ANIMAL_ID; -- 아이디 순으로 오름차순 정렬