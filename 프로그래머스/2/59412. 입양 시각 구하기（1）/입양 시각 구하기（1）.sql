-- 입양 시각 구하기(1)
-- 보호소에서 몇 시에 입양이 가장 활발하게 일어나는지 알아보려고 함
-- 9시부터 19시까지 각 시간대 별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성
-- 결과는 시간대순으로 정렬
SELECT
    HOUR(DATETIME) AS HOUR, -- DATETIME에서 시간만
    COUNT(*) AS COUNT -- 시간별 입양 건수 
FROM 
    ANIMAL_OUTS -- 데이터를 조회할 테이블
WHERE
    HOUR(DATETIME) BETWEEN 9 AND 19 -- 9시부터 19시까지 시간 설정
GROUP BY
    HOUR(DATETIME) -- DATETIME으로 시간별 그룹핑 
ORDER BY
    HOUR(DATETIME) ASC;