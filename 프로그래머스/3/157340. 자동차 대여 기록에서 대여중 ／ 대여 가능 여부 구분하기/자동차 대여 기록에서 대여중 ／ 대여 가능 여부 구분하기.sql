SELECT 
    CAR_ID,
    MAX(
        CASE 
            WHEN '2022-10-16' BETWEEN DATE_FORMAT(START_DATE, '%Y-%m-%d') 
                                AND DATE_FORMAT(END_DATE, '%Y-%m-%d') 
            THEN '대여중'  -- 2022-10-16이 대여 기간에 포함될 경우 '대여중'으로 표시
            ELSE '대여 가능' -- 그렇지 않으면 '대여 가능'으로 표시
        END
    ) AS AVAILABILITY
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 
    CAR_ID -- 자동차 ID 기준으로 그룹화하여 대여 상태를 집계
ORDER BY 
    CAR_ID DESC; -- 자동차 ID를 기준으로 내림차순 정렬