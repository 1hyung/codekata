-- 나이 정보가 없는 회원 수 구하기 
-- USER_INFO 테이블에서 나이 정보가 없는 회원이 몇 명인지 출력하는 SQL문을 작성
-- 컬럼명은 USERS
SELECT
    COUNT (USER_ID) as 'USERS'
FROM 
    USER_INFO 
WHERE 
    AGE IS NULL;