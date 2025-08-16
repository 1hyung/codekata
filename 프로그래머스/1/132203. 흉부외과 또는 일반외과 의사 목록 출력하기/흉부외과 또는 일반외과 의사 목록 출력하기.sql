-- 흉부외과 또는 일반외과 의사 목록 출력하기
-- 진료과가 흉부외과(CS)이거나 일반외과(GS)인 의사의 이름, 의사ID, 진료과, 고용일자를 조회하는 SQL문을 작성
-- 결과는 고용일자를 기준으로 내림차순 정렬하고, 고용일자가 같다면 이름을 기준으로 오름차순 정렬
SELECT
    DR_NAME, -- 의사 이름
    DR_ID, -- 의사 ID
    MCDP_CD, -- 진료과
    DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD -- 고용일자
FROM 
    DOCTOR -- 데이터를 조회할 테이블
WHERE
    MCDP_CD IN ('CS', 'GS') -- 진료과 CS or GS
ORDER BY
    HIRE_YMD DESC, -- 고용일자 내림차순 정렬
    DR_NAME ASC; -- 이름 기준으로 오름차순 정렬