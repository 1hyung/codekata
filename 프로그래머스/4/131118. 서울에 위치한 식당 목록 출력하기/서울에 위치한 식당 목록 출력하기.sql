SELECT 
    A.REST_ID,                          -- 식당 ID
    B.REST_NAME,                        -- 식당 이름
    B.FOOD_TYPE,                        -- 음식 종류
    B.FAVORITES,                        -- 즐겨찾기 수
    B.ADDRESS,                          -- 주소
    ROUND(AVG(A.REVIEW_SCORE), 2) AS SCORE -- 리뷰 평균 점수 (소수점 두 번째 자리까지 반올림)
FROM 
    REST_REVIEW A
JOIN 
    REST_INFO B
ON 
    A.REST_ID = B.REST_ID               -- REST_ID 기준으로 두 테이블 조인
WHERE 
    B.ADDRESS LIKE '서울%'               -- 서울특별시에 위치한 식당 필터링
GROUP BY 
    A.REST_ID, B.REST_NAME, B.FOOD_TYPE, B.FAVORITES, B.ADDRESS
ORDER BY 
    SCORE DESC,                         -- 평균 점수 기준 내림차순
    B.FAVORITES DESC;                   -- 즐겨찾기 수 기준 내림차순