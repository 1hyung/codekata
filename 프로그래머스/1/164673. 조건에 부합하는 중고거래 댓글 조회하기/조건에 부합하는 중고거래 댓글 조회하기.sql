-- 조건에 부합하는 중고거래 댓글 조회하기
SELECT 
    B.TITLE AS TITLE,                     -- 게시글 제목
    B.BOARD_ID AS BOARD_ID,               -- 게시글 ID
    R.REPLY_ID AS REPLY_ID,               -- 댓글 ID
    R.WRITER_ID AS WRITER_ID,             -- 댓글 작성자 ID
    R.CONTENTS AS CONTENTS,               -- 댓글 내용
    DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE -- 댓글 작성일 (YYYY-MM-DD 포맷)
FROM 
    USED_GOODS_BOARD B
JOIN 
    USED_GOODS_REPLY R
ON 
    B.BOARD_ID = R.BOARD_ID              -- 게시글 ID와 댓글의 게시글 ID를 조인
WHERE 
    DATE_FORMAT(B.CREATED_DATE, '%Y-%m') = '2022-10' -- 게시글 작성일이 2022년 10월
ORDER BY 
    R.CREATED_DATE ASC,                   -- 댓글 작성일 기준 오름차순 정렬
    B.TITLE ASC;                          -- 댓글 작성일이 같다면 게시글 제목 기준 오름차순 정렬