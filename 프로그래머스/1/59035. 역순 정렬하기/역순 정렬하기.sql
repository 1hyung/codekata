-- 동물 이름과 보호 시작일을 조회, ANIMAL_ID 역순으로 정렬
SELECT
    NAME,        -- 동물 이름
    DATETIME     -- 보호 시작일
FROM
    ANIMAL_INS   -- 동물의 정보를 담은 데이터 출처 테이블
ORDER BY
    ANIMAL_ID DESC; -- ANIMAL_ID를 기준으로 내림차순 정렬