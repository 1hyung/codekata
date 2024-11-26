SELECT 
    A.REST_ID AS REST_ID,                           -- 식당 ID
    B.REST_NAME AS REST_NAME,                       -- 식당 이름
    B.FOOD_TYPE AS FOOD_TYPE,                      -- 음식 종류
    B.FAVORITES AS FAVORITES,                    -- 즐겨찾기 수
    B.ADDRESS AS ADDRESS,                             -- 주소
    ROUND(AVG(A.REVIEW_SCORE), 2) AS SCORE      -- 리뷰 평균 점수 (소수점 두 자리)
FROM 
    REST_REVIEW A
JOIN 
    REST_INFO B
ON 
    A.REST_ID = B.REST_ID                          -- 두 테이블을 REST_ID로 조인
WHERE 
    B.ADDRESS LIKE '서울%'                          -- 서울 지역 필터링
GROUP BY 
    A.REST_ID, 
    B.REST_NAME, 
    B.FOOD_TYPE, 
    B.FAVORITES, 
    B.ADDRESS                                       -- 그룹화 기준
ORDER BY 
    SCORE DESC,                                 -- 평균 점수 내림차순 정렬
    B.FAVORITES DESC;                               -- 즐겨찾기 수 내림차순 정렬