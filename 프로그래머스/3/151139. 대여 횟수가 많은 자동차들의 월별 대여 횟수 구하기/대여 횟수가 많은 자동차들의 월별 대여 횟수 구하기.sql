SELECT 
    MONTH(START_DATE) AS MONTH,       -- 대여 시작일의 월 추출
    CAR_ID,                           -- 자동차 ID
    COUNT(*) AS RECORDS               -- 대여 횟수
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE 
    START_DATE BETWEEN '2022-08-01' AND '2022-10-31' -- 2022년 8월부터 10월까지 대여 기록 필터링
    AND CAR_ID IN (                   -- 5회 이상 대여 기록이 있는 자동차만 포함
        SELECT 
            CAR_ID
        FROM 
            CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE 
            START_DATE BETWEEN '2022-08-01' AND '2022-10-31' -- 동일한 기간 필터링
        GROUP BY 
            CAR_ID
        HAVING 
            COUNT(*) >= 5            -- 총 대여 횟수가 5회 이상인 자동차만 포함
    )
GROUP BY 
    MONTH(START_DATE), CAR_ID         -- 월별, 자동차 ID별 그룹화
HAVING 
    COUNT(*) > 0                      -- 월별 기록이 있는 경우만 포함
ORDER BY 
    MONTH(START_DATE) ASC,            -- 월을 기준으로 오름차순 정렬
    CAR_ID DESC;                      -- 같은 월 내에서는 자동차 ID를 기준으로 내림차순 정렬