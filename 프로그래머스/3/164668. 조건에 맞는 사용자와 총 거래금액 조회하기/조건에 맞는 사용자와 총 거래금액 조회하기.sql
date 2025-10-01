-- 조건에 맞는 사용자와 총 거래금액 조회하기
-- 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성
-- 결과는 총거래금액을 기준으로 오름차순 정렬
SELECT
    GB.WRITER_ID AS USER_ID, -- 회원 ID
    GU.NICKNAME, -- 닉네임
    SUM(GB.PRICE) AS TOTAL_SALES -- 총 거래금액
FROM
    USED_GOODS_BOARD GB INNER JOIN USED_GOODS_USER GU ON GB.WRITER_ID = GU.USER_ID -- 둘 다 값이 있어야 하니까 INNER JOIN
WHERE 
    STATUS IN ('DONE') -- 상태는 완료된
GROUP BY    
    GB.WRITER_ID -- 닉네임으로 그룹핑
HAVING  
    TOTAL_SALES >= 700000 -- 총 거래 금액 70만원 필터링
ORDER BY
    TOTAL_SALES ASC; -- 총거래금액 기준 오름차순 정렬