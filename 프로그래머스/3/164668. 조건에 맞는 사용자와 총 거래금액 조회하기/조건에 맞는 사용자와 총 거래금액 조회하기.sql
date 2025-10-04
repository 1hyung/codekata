-- 조건에 맞는 사용자와 총 거래금액 조회하기
-- 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성
-- 결과는 총거래금액을 기준으로 오름차순 정렬
SELECT
    UGB.WRITER_ID AS USER_ID, -- 회원 ID
    UGU.NICKNAME, -- 닉네임
    SUM(UGB.PRICE) AS TOTAL_SALES -- 총거래금액
FROM 
    USED_GOODS_BOARD UGB INNER JOIN USED_GOODS_USER UGU ON UGB.WRITER_ID  = UGU.USER_ID -- 둘 다  있어야 하니 INNER JOIN
WHERE
    STATUS IN ('DONE') -- 완료된 중고 거래 필터링
GROUP BY
    UGB.WRITER_ID, UGU.NICKNAME -- 회원 ID와 닉네임 그룹핑 
HAVING
    SUM(UGB.PRICE) >= 700000 -- 총거래금액 70만원 이상 필터링
ORDER BY
    SUM(PRICE) ASC; -- 총거래금액 오름차순 정렬