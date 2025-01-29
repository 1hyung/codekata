-- 2021년에 출판된 '인문' 카테고리 도서 목록 조회
SELECT 
    BOOK_ID,  -- 도서 ID
    DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE -- 날짜 포맷 지정
FROM 
    BOOK
WHERE 
    CATEGORY = '인문'  -- '인문' 카테고리 도서 선택
    AND YEAR(PUBLISHED_DATE) = 2021  -- 2021년에 출판된 도서 선택
ORDER BY 
    PUBLISHED_DATE ASC;  -- 출판일 기준 오름차순 정렬