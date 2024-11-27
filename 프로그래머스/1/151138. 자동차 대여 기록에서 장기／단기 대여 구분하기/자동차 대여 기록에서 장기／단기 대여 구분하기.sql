SELECT 
    HISTORY_ID,                                    -- 대여 기록 ID
    CAR_ID,                                       -- 자동차 ID
    DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE, -- 대여 시작일
    DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,     -- 대여 종료일
    CASE 
        WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 30 THEN '장기 대여' -- 대여 기간이 30일 이상
        ELSE '단기 대여'                          -- 대여 기간이 30일 미만
    END AS RENT_TYPE                              -- 대여 유형
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE 
    START_DATE BETWEEN '2022-09-01' AND '2022-09-30' -- 2022년 9월 1일부터 9월 30일 사이
ORDER BY 
    HISTORY_ID DESC;                              -- 대여 기록 ID 기준 내림차순 정렬