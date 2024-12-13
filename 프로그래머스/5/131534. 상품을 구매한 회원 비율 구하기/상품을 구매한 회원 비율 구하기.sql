-- 2021년에 가입한 전체 회원 수를 @NEWUSER2021 변수에 저장
SELECT 
    @NEWUSER2021 := COUNT(*)
FROM 
    USER_INFO
WHERE 
    YEAR(JOINED) = 2021;

-- 2021년에 가입한 회원 중 구매한 회원 수와 비율 계산
SELECT
    YEAR(SALES_DATE) AS year,         -- 판매일의 연도를 계산
    MONTH(SALES_DATE) AS month,       -- 판매일의 월을 계산
    COUNT(DISTINCT USER_ID) AS purchased_users,  -- 중복되지 않은 구매 회원 수
    ROUND(COUNT(DISTINCT USER_ID) / @NEWUSER2021, 1) AS purchased_ratio -- 구매 비율 계산
FROM 
    ONLINE_SALE
NATURAL JOIN 
    USER_INFO                           -- USER_INFO 테이블과 자연 조인
WHERE 
    YEAR(JOINED) = 2021                 -- 2021년에 가입한 회원만 필터링
GROUP BY 
    YEAR(SALES_DATE), MONTH(SALES_DATE) -- 연도와 월별 그룹화
ORDER BY 
    year ASC, month ASC;                -- 연도와 월을 기준으로 정렬