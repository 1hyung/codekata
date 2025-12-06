-- 모든 레코드 조회하기
-- 모든 동물의 정보를 ANIMAL_ID순으로 조회하는 SQL문을 작성

SELECT * -- 모든 정보 조회
FROM
    ANIMAL_INS -- 데이터 조회할 테이블
ORDER BY
    ANIMAL_ID ASC; -- 모든 동물의 정보를 ANIMAL_ID순으로 오름차순 정렬