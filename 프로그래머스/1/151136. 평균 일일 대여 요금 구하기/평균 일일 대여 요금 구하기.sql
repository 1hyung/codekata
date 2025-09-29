-- 평균 일일 대여 요금 구하기
-- 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성
-- 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정
SELECT
    ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE -- 소수 첫 번째 자리 반올림 평균 일일 대여 요금
FROM 
    CAR_RENTAL_COMPANY_CAR -- 데이터를 조회할 테이블
WHERE 
    CAR_TYPE IN ('SUV'); -- CAR_TYPE은 SUV