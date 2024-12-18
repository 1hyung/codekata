-- 1. 이름이 있는 동물의 ID를 오름차순으로 조회
-- ANIMAL_INS 테이블에서 ANIMAL_ID 컬럼을 조회
SELECT 
    ANIMAL_ID -- 동물의 고유 ID를 선택
FROM 
    ANIMAL_INS -- 동물 보호소 정보가 저장된 테이블
-- 2. WHERE 조건을 추가하여 NAME이 NULL이 아닌 데이터만 필터링
WHERE 
    NAME IS NOT NULL -- 이름이 없는 동물은 제외
-- 3. ORDER BY로 결과를 정렬하여 ID를 오름차순으로 출력
ORDER BY
    ANIMAL_ID ASC; -- ID 기준으로 오름차순 정렬