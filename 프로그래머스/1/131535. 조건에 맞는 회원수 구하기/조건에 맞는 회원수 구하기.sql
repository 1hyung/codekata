-- USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문
SELECT
    COUNT(*) AS USERS -- 조건에 맞는 회원 수 계산
FROM 
    USER_INFO -- 데이터를 조회할 테이블
WHERE 
    YEAR(JOINED) = 2021 -- 가입일이 2021년인 조건
    AND AGE BETWEEN 20 AND 29; -- 나이가 20세 이상 29세 이하인 조건