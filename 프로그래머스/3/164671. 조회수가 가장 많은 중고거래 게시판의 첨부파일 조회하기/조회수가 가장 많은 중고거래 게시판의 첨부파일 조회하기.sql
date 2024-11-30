SELECT 
    CONCAT('/home/grep/src/', F.BOARD_ID, '/', F.FILE_ID, F.FILE_NAME, F.FILE_EXT) AS FILE_PATH -- 첨부파일 경로 생성
FROM 
    USED_GOODS_BOARD B
JOIN 
    USED_GOODS_FILE F
ON 
    B.BOARD_ID = F.BOARD_ID -- 게시글 ID 기준으로 두 테이블 조인
WHERE 
    B.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD) -- 최대 조회수를 가진 게시글 필터링
ORDER BY 
    F.FILE_ID DESC; -- FILE_ID 기준으로 내림차순 정렬