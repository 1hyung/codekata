-- 2021년에 가입한 전체 회원 수를 @NEWUSER2021 변수에 저장
SELECT @NEWUSER2021 := COUNT(*) 
FROM user_info 
WHERE YEAR(joined) = 2021;

-- 2021년에 가입한 회원 중에서 구매한 회원 수와 그 비율을 계산
SELECT
    -- 판매일의 연도를 계산하여 'year'로 출력
    YEAR(sales_date) AS year, 
    
    -- 판매일의 월을 계산하여 'month'로 출력
    MONTH(sales_date) AS month, 
    
    -- 중복되지 않은 구매한 회원 수를 계산하여 'purchased_users'로 출력
    COUNT(DISTINCT user_id) AS purchased_users, 
    
    -- 구매한 회원 수를 2021년 전체 가입자 수로 나눈 후 소수점 1자리에서 반올림하여 'purchased_ratio'로 출력
    ROUND(COUNT(DISTINCT user_id) / @NEWUSER2021, 1) AS purchased_ratio
FROM 
    -- 온라인 판매 테이블과 사용자 정보를 연결 (NATURAL JOIN은 동일한 필드로 자동 조인)
    online_sale
NATURAL JOIN user_info

-- 2021년에 가입한 회원들만 대상으로 필터링
WHERE YEAR(joined) = 2021

-- 연도와 월을 기준으로 그룹화하여, 연도별, 월별로 구매한 회원 수와 비율을 계산
GROUP BY year, month

-- 결과를 연도별로 오름차순 정렬, 같은 연도일 경우 월별로 오름차순 정렬
ORDER BY year, month;
