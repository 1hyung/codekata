SELECT 
    YEAR(S.SALES_DATE) AS YEAR,                -- 판매 연도
    MONTH(S.SALES_DATE) AS MONTH,              -- 판매 월
    U.GENDER,                                  -- 성별 (0: 남성, 1: 여성)
    COUNT(DISTINCT S.USER_ID) AS USERS         -- 고유 사용자 수 집계
FROM 
    ONLINE_SALE S
JOIN 
    USER_INFO U
ON 
    S.USER_ID = U.USER_ID                      -- USER_ID를 기준으로 두 테이블 결합
WHERE 
    U.GENDER IS NOT NULL                       -- 성별 정보가 있는 경우만 필터링
GROUP BY 
    YEAR(S.SALES_DATE), MONTH(S.SALES_DATE), U.GENDER
ORDER BY 
    YEAR(S.SALES_DATE), MONTH(S.SALES_DATE), U.GENDER;