-- 경기도에 위치한 식품창고 목록 출력하기
-- 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성
-- 냉동시설 여부가 NULL인 경우, 'N'으로 출력
-- 결과는 창고 ID를 기준으로 오름차순 정렬
SELECT 
    WAREHOUSE_ID, -- 창고의 ID
    WAREHOUSE_NAME, -- 창고의 이름
    ADDRESS, -- 주소
    IFNULL(FREEZER_YN, 'N') AS FREEZER_YN -- 냉동시설 여부
FROM
    FOOD_WAREHOUSE -- 데이터를 조회할 테이블
WHERE 
    ADDRESS LIKE '%경기도%' -- 경기도에 위치한 창고 찾기
ORDER BY
    WAREHOUSE_ID ASC; -- 창고 ID를 오름차순 정렬