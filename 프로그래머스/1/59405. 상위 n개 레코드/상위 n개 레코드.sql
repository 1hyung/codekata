-- 상위 n개 레코드
-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성
SELECT
    NAME -- 동물의 이름
FROM    
    ANIMAL_INS -- 데이터를 조회할 테이블
ORDER BY
    DATETIME ASC -- 보호 시작일 오름차순 정렬
LIMIT 1; -- 가장 먼저 들어온 동물 선택