-- 완료된 중고 거래의 총금액이 70만 원 이상인 사용자 조회
SELECT 
    U.USER_ID,  -- 회원 ID
    U.NICKNAME, -- 닉네임
    SUM(B.PRICE) AS TOTAL_SALES -- 총 거래 금액
FROM 
    USED_GOODS_BOARD B
JOIN 
    USED_GOODS_USER U 
    ON B.WRITER_ID = U.USER_ID -- 작성자와 사용자 매칭
WHERE 
    B.STATUS = 'DONE' -- 완료된 거래만 선택
GROUP BY 
    U.USER_ID, U.NICKNAME -- 사용자별 그룹화
HAVING 
    TOTAL_SALES >= 700000 -- 70만 원 이상인 사용자만 선택
ORDER BY 
    TOTAL_SALES ASC; -- 총 거래 금액 기준 오름차순 정렬