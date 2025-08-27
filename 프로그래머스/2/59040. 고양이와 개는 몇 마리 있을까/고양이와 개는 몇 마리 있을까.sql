-- 고양이와 개는 몇 마리 있을까
-- 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성
-- 고양이를 개보다 먼저 조회
SELECT
    ANIMAL_TYPE, -- 동물의 종류
    COUNT(*) as count -- 동물의 수
FROM 
    ANIMAL_INS -- 데이터를 조회할 테이블
WHERE
    ANIMAL_TYPE IN ('Cat', 'Dog') -- ANIMAL_TYPE 고양이와 개
GROUP BY
    ANIMAL_TYPE -- 고양이와 개로 그룹화
ORDER BY 
    FIELD(ANIMAL_TYPE, 'Cat', 'Dog'); -- 고양이 먼저 그 다음 개 조회