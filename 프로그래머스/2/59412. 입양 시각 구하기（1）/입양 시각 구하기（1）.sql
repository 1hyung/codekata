-- 입양 시각 구하기(1)
-- 09:00부터 19:59까지 각 시간대별 입양 건수를 조회
SELECT 
    HOUR(DATETIME) AS HOUR,   -- DATETIME에서 시간을 추출하여 HOUR로 표시
    COUNT(*) AS COUNT         -- 해당 시간대의 입양 건수
FROM 
    ANIMAL_OUTS               -- 데이터를 조회할 테이블
WHERE 
    HOUR(DATETIME) BETWEEN 9 AND 19 -- 시간대가 09:00부터 19:59까지인 경우 필터링
GROUP BY 
    HOUR(DATETIME)            -- 시간대별로 그룹화
ORDER BY 
    HOUR(DATETIME) ASC;           -- 시간대 순으로 정렬