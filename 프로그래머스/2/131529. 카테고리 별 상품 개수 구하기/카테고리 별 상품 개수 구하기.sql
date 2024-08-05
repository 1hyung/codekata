SELECT 
    LEFT(PRODUCT_CODE, 2) AS CATEGORY,  -- PRODUCT_CODE의 앞 2자리를 CATEGORY로 추출
    COUNT(*) AS PRODUCTS               -- 각 카테고리별 상품 개수를 세어서 PRODUCTS로 명명
FROM 
    PRODUCT                            -- PRODUCT 테이블에서
GROUP BY 
    LEFT(PRODUCT_CODE, 2)              -- PRODUCT_CODE의 앞 2자리로 그룹화
ORDER BY 
    CATEGORY;                          -- CATEGORY를 기준으로 오름차순 정렬