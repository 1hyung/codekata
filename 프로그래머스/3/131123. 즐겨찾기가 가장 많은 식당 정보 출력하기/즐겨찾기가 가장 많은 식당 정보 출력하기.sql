-- 즐겨찾기가 가장 많은 식당 정보 출력하기
-- 음식종류별로 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성
-- 결과는 음식 종류를 기준으로 내림차순 정렬
SELECT
    R.FOOD_TYPE,
    R.REST_ID,
    R.REST_NAME,
    R.FAVORITES
FROM REST_INFO R
WHERE R.FAVORITES = (
    SELECT MAX(FAVORITES)
    FROM REST_INFO
    WHERE FOOD_TYPE = R.FOOD_TYPE
)
ORDER BY R.FOOD_TYPE DESC;