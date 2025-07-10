-- 루시와 엘라 찾기
-- 특정 이름을 가진 동물의 정보를 조회
SELECT 
    ANIMAL_ID,       -- 동물의 ID
    NAME,            -- 이름
    SEX_UPON_INTAKE  -- 성별 및 중성화 여부
FROM 
    ANIMAL_INS       -- 동물 보호소 테이블
WHERE 
    NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty') -- 이름 조건
ORDER BY 
    ANIMAL_ID ASC;   -- 동물 ID 기준 오름차순 정렬