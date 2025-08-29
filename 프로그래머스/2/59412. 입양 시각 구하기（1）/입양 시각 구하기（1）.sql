-- 입양 시각 구하기(1)
-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 함
-- 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성
-- 결과는 시간대 순으로 정렬
SELECT
    HOUR(DATETIME), -- 시간
    COUNT(*) AS COUNT -- 입양 수 
FROM 
    ANIMAL_OUTS -- 데이터를 조회할 테이블 
WHERE
    HOUR(DATETIME) BETWEEN 9 AND 19 -- 9시부터 19시까지 구간 설정
GROUP BY
    HOUR(DATETIME) -- 시간대별로 그룹화 
ORDER BY
    HOUR(DATETIME) ASC;  -- 시간 순 정렬