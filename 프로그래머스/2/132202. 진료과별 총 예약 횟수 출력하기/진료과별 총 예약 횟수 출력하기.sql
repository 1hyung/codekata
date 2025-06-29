-- 진료과별 총 예약 횟수 출력하기 
-- 2022년 5월에 예약한 환자 수를 진료과 코드별로 조회
SELECT 
    MCDP_CD AS "진료과 코드",        -- 진료과 코드
    COUNT(*) AS "5월예약건수"        -- 해당 진료과의 5월 예약 건수
FROM 
    APPOINTMENT                    -- 데이터를 조회할 테이블
WHERE 
    EXTRACT(YEAR FROM APNT_YMD) = 2022 -- 예약일시가 2022년
    AND EXTRACT(MONTH FROM APNT_YMD) = 5 -- 예약일시가 5월
GROUP BY 
    MCDP_CD                        -- 진료과 코드별로 그룹화
ORDER BY 
    COUNT(*) ASC,                  -- 예약 건수를 기준으로 오름차순 정렬
    MCDP_CD ASC;                   -- 예약 건수가 같을 경우 진료과 코드를 기준으로 오름차순 정렬