-- 성분 타입별 총 주문량 조회
SELECT 
    I.INGREDIENT_TYPE,                     -- 아이스크림 성분 타입
    SUM(F.TOTAL_ORDER) AS TOTAL_ORDER     -- 총 주문량 합계
FROM 
    FIRST_HALF F
JOIN 
    ICECREAM_INFO I 
ON 
    F.FLAVOR = I.FLAVOR                   -- FLAVOR를 기준으로 JOIN
GROUP BY 
    I.INGREDIENT_TYPE                     -- 성분 타입별로 그룹화
ORDER BY 
    TOTAL_ORDER ASC;                      -- 총 주문량 기준 오름차순 정렬