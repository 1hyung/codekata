-- 카테고리별 2022년 1월 도서 판매량 합산 및 카테고리 오름차순 정렬
SELECT
    B.CATEGORY,                          -- 도서 카테고리
    SUM(S.SALES) AS TOTAL_SALES          -- 해당 카테고리의 총 판매량
FROM
    BOOK B                               -- 도서 정보 테이블
JOIN
    BOOK_SALES S                         -- 도서 판매 정보 테이블
ON
    B.BOOK_ID = S.BOOK_ID                -- 도서 ID로 두 테이블을 연결
WHERE
    S.SALES_DATE BETWEEN '2022-01-01' AND '2022-01-31' -- 2022년 1월 판매 데이터 필터링
GROUP BY
    B.CATEGORY                           -- 카테고리별 그룹화
ORDER BY
    B.CATEGORY ASC;                      -- 카테고리명을 기준으로 오름차순 정렬