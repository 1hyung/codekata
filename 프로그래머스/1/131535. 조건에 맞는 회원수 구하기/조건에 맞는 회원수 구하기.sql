-- 조건에 맞는 회원수 구하기
-- USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성
SELECT
    COUNT(USER_ID) AS USERS -- 회원 수 구하기
FROM 
    USER_INFO -- 데이터를 조회할 테이블
WHERE
    YEAR(JOINED) = 2021 -- 2021년 가입한 회원 필터링
    AND
    AGE BETWEEN 20 AND 29; -- 나이 20세 이상 29세 이하 필터링