-- 대여 기록이 존재하는 자동차 리스트 구하기
SELECT DISTINCT C.CAR_ID  -- 중복 없이 자동차 ID 조회
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H 
    ON C.CAR_ID = H.CAR_ID  -- 자동차 ID 기준으로 두 테이블 JOIN
WHERE 
    C.CAR_TYPE = '세단'  -- 자동차 종류가 '세단'인 경우만 선택
    AND MONTH(H.START_DATE) = 10  -- 대여 시작일이 10월인 경우만 선택
ORDER BY C.CAR_ID DESC;  -- 자동차 ID 기준으로 내림차순 정렬