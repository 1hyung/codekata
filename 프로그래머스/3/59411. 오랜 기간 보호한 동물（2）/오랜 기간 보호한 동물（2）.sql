-- 오랜 기간 보호한 동물(2)
-- 입양을 간 동물 중, 보호 기간이 가장 길었던 동물 두 마리의 아이디와 이름을 조회하는 SQL문을 작성
-- 결과는 보호 기간이 긴 순으로 조회
SELECT
    AI.ANIMAL_ID, -- 보호 기간이 길었던 동물의 아이디
    AI.NAME -- 이름
FROM
    ANIMAL_INS AI INNER JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID -- 둘 다 데이터가 있어야 하니 INNER JOIN
ORDER BY
    DATEDIFF(AO.DATETIME, AI.DATETIME) DESC -- 보호 기간 긴 순이기 때문에 내림차순 정렬
LIMIT 2; -- 두 마리만 나와야 하니 2개만 선택