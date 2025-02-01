-- 만원 단위 가격대 별 상품 개수 조회
SELECT 
    FLOOR(PRICE / 10000) * 10000 AS PRICE_GROUP, -- 가격을 만원 단위로 변환
    COUNT(*) AS PRODUCTS -- 해당 가격대에 속하는 상품 개수
FROM 
    PRODUCT
GROUP BY 
    PRICE_GROUP -- 가격대를 기준으로 그룹화
ORDER BY 
    PRICE_GROUP ASC; -- 가격대 기준으로 오름차순 정렬