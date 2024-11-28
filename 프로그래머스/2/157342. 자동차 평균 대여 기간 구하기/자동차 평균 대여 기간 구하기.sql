SELECT 
    CAR_ID, 
    ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1) AS AVERAGE_DURATION -- 평균 대여 기간 계산
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 
    CAR_ID -- 자동차 ID별 그룹화
HAVING 
    AVERAGE_DURATION >= 7 -- 평균 대여 기간이 7일 이상인 자동차 필터링
ORDER BY 
    AVERAGE_DURATION DESC, -- 평균 대여 기간 내림차순 정렬
    CAR_ID DESC; -- 자동차 ID 내림차순 정렬