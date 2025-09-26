-- 조건에 맞는 도서 리스트 출력하기
-- BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 도서 ID(BOOK_ID), 출판일 (PUBLISHED_DATE)을 출력하는 SQL문을 작성
-- 결과는 출판일을 기준으로 오름차순 정렬
SELECT
    BOOK_ID, -- 도서 아이디
    DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE -- 출판일
FROM
    BOOK -- 데어터를 조회할 테이블
WHERE 
    CATEGORY IN ('인문') AND YEAR(PUBLISHED_DATE) = 2021 -- 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트 필터링
ORDER BY   
    PUBLISHED_DATE ASC; -- 출판일을 기준으로 오름차순 정렬