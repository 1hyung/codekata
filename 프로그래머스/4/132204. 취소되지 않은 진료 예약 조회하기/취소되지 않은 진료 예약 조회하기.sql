-- 취소되지 않은 진료 예약 조회하기
SELECT 
    A.APNT_NO,                -- 진료예약번호
    P.PT_NAME,                -- 환자이름
    A.PT_NO,                  -- 환자번호
    A.MCDP_CD,                -- 진료과코드
    D.DR_NAME,                -- 의사이름
    A.APNT_YMD                -- 진료예약일시
FROM 
    APPOINTMENT A
JOIN 
    PATIENT P 
    ON A.PT_NO = P.PT_NO     -- 환자번호 기준 JOIN
JOIN 
    DOCTOR D 
    ON A.MDDR_ID = D.DR_ID   -- 의사 ID 기준 JOIN
WHERE 
    A.MCDP_CD = 'CS'         -- 진료과코드가 흉부외과(CS)
    AND A.APNT_CNCL_YN = 'N' -- 예약취소되지 않은 경우
    AND DATE(A.APNT_YMD) = '2022-04-13' -- 2022년 4월 13일 예약
ORDER BY 
    A.APNT_YMD ASC;          -- 진료예약일시 기준 오름차순 정렬