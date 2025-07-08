-- 3월에 태어난 여성 회원 목록 출력하기
SELECT 
    MEMBER_ID,        -- 회원 ID
    MEMBER_NAME,      -- 회원 이름
    GENDER,           -- 성별
    DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH -- 생년월일을 YYYY-MM-DD 형식으로 변환
FROM 
    MEMBER_PROFILE -- 데이터를 조회할 테이블
WHERE 
    GENDER = 'W'                    -- 여성 회원 필터링
    AND MONTH(DATE_OF_BIRTH) = 3     -- 생년월일이 3월인 회원 필터링
    AND TLNO IS NOT NULL             -- 전화번호가 NULL이 아닌 회원만 조회
ORDER BY 
    MEMBER_ID ASC; -- 회원 ID를 기준으로 오름차순 정렬