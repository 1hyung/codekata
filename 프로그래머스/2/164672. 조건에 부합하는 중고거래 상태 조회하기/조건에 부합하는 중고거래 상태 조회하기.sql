-- 조건에 부합하는 중고거래 상태 조회하기
SELECT 
    BOARD_ID,              -- 게시글 ID
    WRITER_ID,             -- 작성자 ID
    TITLE,                 -- 게시글 제목
    PRICE,                 -- 가격
    CASE                   -- 거래상태 분류
        WHEN STATUS = 'SALE' THEN '판매중'
        WHEN STATUS = 'RESERVED' THEN '예약중'
        WHEN STATUS = 'DONE' THEN '거래완료'
        ELSE '상태미정'     -- 예외 상태 처리
    END AS STATUS
FROM 
    USED_GOODS_BOARD
WHERE 
    CREATED_DATE = '2022-10-05' -- 작성일 필터링
ORDER BY 
    BOARD_ID DESC;         -- 게시글 ID 기준 내림차순 정렬