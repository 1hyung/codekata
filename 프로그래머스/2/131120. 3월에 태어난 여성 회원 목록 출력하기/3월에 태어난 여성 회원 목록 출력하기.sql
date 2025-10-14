-- 3월에 태어난 여성 회원 목록 출력하기
-- 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL문을 작성
-- 전화번호가 NULL인 경우는 출력대상에서 제외
-- 결과는 회원ID를 기준으로 오름차순 정렬
SELECT
    MEMBER_ID, -- 회원의 ID
    MEMBER_NAME, -- 이름
    GENDER, -- 성별
    DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH -- 생년월일
FROM
    MEMBER_PROFILE -- 데이터를 조회할 테이블
WHERE
    MONTH(DATE_OF_BIRTH) = 03 AND TLNO IS NOT NULL AND GENDER IN ('W') -- 생일 3월, 전화번호 존재, 성별은 여성
ORDER BY    
    MEMBER_ID ASC; -- 결과는 MEMBER_ID 기준 오름차순 정렬