-- 나이 정보가 없는 회원 수 구하기 
-- USER_INFO 테이블에서 나이 정보가 없는 회원이 몇 명인지 출력하는 SQL문을 작성
-- 컬럼명은 USERS로 지정
SELECT
    COUNT(USER_ID) AS USERS -- 회원 수 구하기
FROM 
    USER_INFO -- 데이터를 조회할 테이블
WHERE 
    AGE IS NULL; -- 나이 정보가 없는 회원 필터링