-- 자동차 종류 별로 특정 옵션이 포함된 자동차 수 조회
SELECT
    CAR_TYPE,                         -- 자동차 종류
    COUNT(*) AS CARS                  -- 자동차 수
FROM
    CAR_RENTAL_COMPANY_CAR            -- 데이터를 조회할 테이블
WHERE
    OPTIONS LIKE '%통풍시트%'         -- 옵션에 '통풍시트'가 포함된 경우
    OR OPTIONS LIKE '%열선시트%'      -- 옵션에 '열선시트'가 포함된 경우
    OR OPTIONS LIKE '%가죽시트%'      -- 옵션에 '가죽시트'가 포함된 경우
GROUP BY
    CAR_TYPE                          -- 자동차 종류별로 그룹화
ORDER BY
    CAR_TYPE ASC;                     -- 자동차 종류를 기준으로 오름차순 정렬