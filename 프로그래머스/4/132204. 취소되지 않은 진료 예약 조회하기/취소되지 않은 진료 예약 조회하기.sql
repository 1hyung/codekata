SELECT 
    A.APNT_NO,         -- 진료 예약 번호
    P.PT_NAME,         -- 환자 이름
    A.PT_NO,           -- 환자 번호
    A.MCDP_CD,         -- 진료 과목 코드 (CS: 흉부외과)
    D.DR_NAME,         -- 의사 이름
    A.APNT_YMD         -- 진료 예약 일시
FROM 
    APPOINTMENT A
JOIN 
    PATIENT P 
    ON A.PT_NO = P.PT_NO  -- 환자 번호를 기준으로 JOIN
JOIN 
    DOCTOR D 
    ON A.MDDR_ID = D.DR_ID  -- 의사 ID를 기준으로 JOIN
WHERE 
    DATE(A.APNT_YMD) = '2022-04-13'  -- 2022년 4월 13일 예약
    AND A.APNT_CNCL_YN = 'N'         -- 취소되지 않은 예약
    AND A.MCDP_CD = 'CS'             -- 진료 과목이 흉부외과
ORDER BY 
    A.APNT_YMD ASC;                  -- 예약 일시 기준 오름차순 정렬