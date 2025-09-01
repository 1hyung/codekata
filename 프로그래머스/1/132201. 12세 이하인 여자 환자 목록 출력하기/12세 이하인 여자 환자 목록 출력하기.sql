-- 12세 이하인 여자 환자 목록 출력하기
-- 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL문을 작성
-- 전화번호가 없는 경우, 'NONE'으로 출력
-- 결과는 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬
SELECT
    PT_NAME, -- 환자이름
    PT_NO, -- 환자번호
    GEND_CD, -- 성별코드
    AGE, -- 나이
    IFNULL(TLNO, 'NONE') AS TLNO -- 전화번호, 없는 경우 NONE 출력
FROM
    PATIENT -- 데이터를 조회할 테이블
WHERE 
    GEND_CD = 'W' AND -- 여자만 필터링
    AGE <= 12 -- 12세 이하 필터링
ORDER BY
    AGE DESC, PT_NAME ASC; -- 나이 기준 내림차순 정렬, 나이 같으면 오름차순 정렬