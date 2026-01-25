-- 년, 월, 성별 별 상품 구매 회원 수 구하기
SELECT 
    YEAR(S.SALES_DATE) AS YEAR,            -- 판매 날짜의 연도 추출
    MONTH(S.SALES_DATE) AS MONTH,          -- 판매 날짜의 월 추출
    U.GENDER,                              -- 회원 성별 (0: 남성, 1: 여성)
    COUNT(DISTINCT S.USER_ID) AS USERS     -- 각 성별 별 구매한 회원 수
FROM 
    ONLINE_SALE S
JOIN 
    USER_INFO U 
    ON S.USER_ID = U.USER_ID               -- USER_INFO와 ONLINE_SALE 테이블을 회원 ID로 조인
WHERE 
    U.GENDER IS NOT NULL                   -- 성별 정보가 없는 경우 제외
GROUP BY 
    YEAR(S.SALES_DATE),                    -- 년
    MONTH(S.SALES_DATE),                   -- 월
    U.GENDER                               -- 성별
ORDER BY 
    YEAR(S.SALES_DATE),                    -- 년 오름차순 정렬
    MONTH(S.SALES_DATE),                   -- 월 오름차순 정렬
    U.GENDER;                              -- 성별 오름차순 정렬