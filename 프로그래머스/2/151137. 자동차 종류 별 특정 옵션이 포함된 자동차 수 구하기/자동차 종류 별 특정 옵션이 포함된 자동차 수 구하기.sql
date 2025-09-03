-- 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
-- '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가 자동차 종류 별로 몇 대인지 출력하는 SQL문을 작성
-- 자동차 수에 대한 컬럼명은 CARS로 지정하고, 결과는 자동차 종류를 기준으로 오름차순 정렬
SELECT
    CAR_TYPE, -- 자동차 종류
    COUNT(*) AS CARS -- 자동차 종류 별 대수 
FROM 
    CAR_RENTAL_COMPANY_CAR -- 데이터를 조회할 테이블
WHERE 
    OPTIONS LIKE '%통풍시트%' OR OPTIONS LIKE '%열선시트%' OR OPTIONS LIKE '%가죽시트%' -- 통풍시트, 열선시트, 가죽시트 중 옵션이 하나 이상의 옵션이 포함된 자동차 필터링
GROUP BY    
    CAR_TYPE -- 자동차 종류별 그룹화 
ORDER BY
    CAR_TYPE ASC; -- 자동차 종류를 기준으로 오름차순 정렬