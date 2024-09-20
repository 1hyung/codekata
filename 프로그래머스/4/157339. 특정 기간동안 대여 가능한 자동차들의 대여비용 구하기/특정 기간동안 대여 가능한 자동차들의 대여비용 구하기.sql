SELECT
    CRCR.CAR_ID,
    CRCR.CAR_TYPE,
    ROUND(CRCR.DAILY_FEE * 30 * (100 - CRCDP.DISCOUNT_RATE) / 100, 0) AS FEE
FROM
    CAR_RENTAL_COMPANY_CAR AS CRCR
INNER JOIN
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS CRCDP 
    ON CRCR.CAR_TYPE = CRCDP.CAR_TYPE
WHERE
    CRCR.CAR_ID NOT IN (
        -- 2022년 11월 1일부터 11월 30일까지 이미 대여된 자동차 제외
        SELECT 
            CAR_ID
        FROM
            CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE 
            END_DATE >= '2022-11-01'
        AND
            START_DATE < '2022-12-01'
    )
AND
    (CRCR.CAR_TYPE = '세단' OR CRCR.CAR_TYPE = 'SUV') -- 세단 또는 SUV 자동차 필터링
AND
    CRCDP.DURATION_TYPE = '30일 이상' -- 대여 기간이 30일 이상인 경우만 할인 적용
GROUP BY
    CRCR.CAR_ID
HAVING
    FEE BETWEEN 500000 AND 1999999 -- 대여 금액이 50만 원 이상 200만 원 미만인 경우 필터링
ORDER BY
    FEE DESC,        -- 대여 금액을 기준으로 내림차순 정렬
    CAR_TYPE ASC,    -- 자동차 종류를 기준으로 오름차순 정렬
    CAR_ID DESC;     -- 자동차 ID를 기준으로 내림차순 정렬
