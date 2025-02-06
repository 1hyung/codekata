-- 음식 종류별로 즐겨찾기 수가 가장 많은 식당 정보 조회
-- 결과는 FOOD_TYPE 기준 내림차순 정렬
SELECT 
    r.FOOD_TYPE, 
    r.REST_ID, 
    r.REST_NAME, 
    r.FAVORITES
FROM REST_INFO r
JOIN (
    -- 각 음식 종류별 최대 즐겨찾기 수를 구하는 서브쿼리
    SELECT FOOD_TYPE, MAX(FAVORITES) AS MAX_FAVORITES
    FROM REST_INFO
    GROUP BY FOOD_TYPE
) max_fav 
ON r.FOOD_TYPE = max_fav.FOOD_TYPE 
AND r.FAVORITES = max_fav.MAX_FAVORITES
ORDER BY r.FOOD_TYPE DESC;