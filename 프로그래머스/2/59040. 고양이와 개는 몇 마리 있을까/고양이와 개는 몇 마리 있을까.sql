-- 동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문
-- 고양이를 개보다 먼저 조회
SELECT
    ANIMAL_TYPE, -- 동물의 종류
    COUNT(*) AS count -- 해당 동물의 개수
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE 
    ANIMAL_TYPE IN ('Cat', 'Dog') -- 고양이와 개만 필터링
GROUP BY 
    ANIMAL_TYPE -- 동물의 종류별로 그룹화
ORDER BY
    FIELD(ANIMAL_TYPE, 'Cat', 'Dog'); -- 고양이를 먼저, 개를 나중에 정렬