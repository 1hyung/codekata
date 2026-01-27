-- 입양 시각 구하기(2)
SET @hour := -1;

SELECT 
    (@hour := @hour + 1) AS HOUR,                                -- 시간대 0~23 생성
    (SELECT COUNT(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) AS COUNT -- 해당 시간대 입양 건수 집계
FROM 
    ANIMAL_OUTS
WHERE 
    @hour < 23;                                                  -- 시간대가 23 이하일 때만 반복