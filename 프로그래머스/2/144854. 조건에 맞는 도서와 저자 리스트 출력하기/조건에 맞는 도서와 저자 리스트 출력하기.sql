-- 조건에 맞는 도서와 저자 리스트 출력하기
-- '경제' 카테고리에 속하는 도서들의 도서 ID(BOOK_ID), 저자명(AUTHOR_NAME), 출판일(PUBLISHED_DATE) 리스트를 출력하는 SQL문을 작성
-- 결과는 출판일을 기준으로 오름차순 정렬
SELECT
    B.BOOK_ID, -- 도서 ID
    A.AUTHOR_NAME, -- 저자명
    DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE -- 출판일
FROM 
    BOOK B INNER JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID -- 둘 다 있어야 하니 INNER JOIN
WHERE
    CATEGORY = '경제' -- 경제 카테고리 
ORDER BY 
    B.PUBLISHED_DATE ASC; -- 출판일 기준으로 오름차순 정렬