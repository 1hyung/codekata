-- 보호 기간이 가장 길었던 동물 두 마리 조회
SELECT
    I.ANIMAL_ID, -- 동물의 아이디
    I.NAME       -- 동물의 이름
FROM
    ANIMAL_INS I
JOIN
    ANIMAL_OUTS O
ON
    I.ANIMAL_ID = O.ANIMAL_ID -- 입양된 동물 연결
ORDER BY
    DATEDIFF(O.DATETIME, I.DATETIME) DESC, -- 보호 기간 기준 내림차순 정렬
    I.ANIMAL_ID ASC -- 보호 기간이 같을 경우 아이디 기준 오름차순 정렬
LIMIT 2; -- 상위 2개 결과만 반환