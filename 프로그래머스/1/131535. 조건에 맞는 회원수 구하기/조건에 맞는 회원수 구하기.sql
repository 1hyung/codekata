-- 조건에 맞는 회원수 구하기
-- USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성
SELECT
    COUNT(USER_ID) AS USERS
FROM 
    USER_INFO
WHERE
    YEAR(JOINED) = 2021 
    AND
    AGE BETWEEN 20 AND 29;