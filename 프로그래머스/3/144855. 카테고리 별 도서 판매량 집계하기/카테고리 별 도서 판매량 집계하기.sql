-- 카테고리 별 도서 판매량 집계하기
-- 2022년 1월의 카테고리 별 도서 판매량을 합산하고, 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문을 작성
-- 결과는 카테고리명을 기준으로 오름차순 정렬
SELECT
    B.CATEGORY, -- 카테고리명
    SUM(SALES) AS TOTAL_SALES -- 총 판매량
FROM
    BOOK B LEFT JOIN BOOK_SALES BS ON BS.BOOK_ID = B.BOOK_ID -- 테이블 조인 
WHERE 
    YEAR(SALES_DATE) = 2022 AND MONTH(SALES_DATE) = 1 -- 2022년 1월 필터링
GROUP BY
    B.CATEGORY -- 카테고리명으로 그룹화
ORDER BY
    B.CATEGORY ASC; -- 카테고리명으로 오름차순 정렬