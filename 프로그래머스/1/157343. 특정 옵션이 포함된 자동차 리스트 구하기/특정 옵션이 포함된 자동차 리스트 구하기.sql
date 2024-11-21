SELECT 
    CAR_ID,         -- 자동차 ID
    CAR_TYPE,       -- 자동차 종류
    DAILY_FEE,      -- 일일 대여 요금
    OPTIONS         -- 옵션 리스트
FROM 
    CAR_RENTAL_COMPANY_CAR
WHERE 
    OPTIONS LIKE '%네비게이션%'  -- 네비게이션 옵션이 포함된 경우 필터링
ORDER BY 
    CAR_ID DESC;    -- 자동차 ID를 기준으로 내림차순 정렬