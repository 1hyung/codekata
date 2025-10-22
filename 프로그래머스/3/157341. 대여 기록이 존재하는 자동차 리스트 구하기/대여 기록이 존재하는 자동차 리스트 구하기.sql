-- 대여 기록이 존재하는 자동차 리스트 구하기
SELECT DISTINCT 
    C.CAR_ID -- 중복 제거
FROM 
    CAR_RENTAL_COMPANY_CAR C INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY RH ON C.CAR_ID = RH.CAR_ID -- 두 테이블에 존재해야 하니까 inner join
WHERE 
    MONTH(RH.START_DATE) = 10 AND C.CAR_TYPE = '세단' -- 10월과 세단 필터링
ORDER BY
    C.CAR_ID DESC;  -- 자동차 ID 기준으로 내림차순 정렬