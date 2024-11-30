SELECT 
    CART_ID
FROM 
    CART_PRODUCTS
WHERE 
    NAME IN ('Milk', 'Yogurt') -- 우유와 요거트를 필터링
GROUP BY 
    CART_ID -- 장바구니 ID로 그룹화
HAVING 
    COUNT(DISTINCT NAME) = 2 -- Milk와 Yogurt 두 종류 모두 포함한 장바구니
ORDER BY 
    CART_ID; -- 결과를 장바구니 ID 기준으로 오름차순 정렬