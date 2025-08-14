-- 강원도에 위치한 생산공장 목록 출력하기
-- 강원도에 위치한 식품공장의 공장 ID, 공장 이름, 주소를 조회하는 SQL문을 작성
-- 결과는 공장 ID를 기준으로 오름차순 정렬
SELECT
    FACTORY_ID, -- 공장 ID
    FACTORY_NAME, -- 공장 이름
    ADDRESS -- 주소
FROM
    FOOD_FACTORY -- 데이터 조회할 테이블
WHERE 
    ADDRESS LIKE '%강원도%' -- 강원도에 있는 공장 필터링
ORDER BY
    FACTORY_ID ASC; -- 공장 ID를 기준으로 오름차순 정렬