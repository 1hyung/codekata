-- '경제' 카테고리에 속하는 도서의 정보 조회
SELECT 
    B.BOOK_ID,                                         -- 도서 ID
    A.AUTHOR_NAME,                                     -- 저자명
    DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE -- 포맷 변환된 출판일
FROM 
    BOOK B
JOIN 
    AUTHOR A
    ON B.AUTHOR_ID = A.AUTHOR_ID                      -- BOOK과 AUTHOR 테이블 조인
WHERE 
    B.CATEGORY = '경제'                               -- '경제' 카테고리 조건 필터링
ORDER BY 
    B.PUBLISHED_DATE ASC;                             -- 출판일 오름차순 정렬