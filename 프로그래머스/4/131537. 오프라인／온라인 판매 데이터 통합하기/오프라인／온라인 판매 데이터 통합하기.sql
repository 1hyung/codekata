SELECT 
    DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, -- 날짜 형식을 'YYYY-MM-DD'로 변환
    PRODUCT_ID,                                        -- 상품 ID
    USER_ID,                                           -- 사용자 ID (오프라인 판매의 경우 NULL)
    SALES_AMOUNT                                       -- 판매량
FROM (
    SELECT 
        DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, -- 온라인 판매 데이터의 판매 날짜
        PRODUCT_ID,                                        -- 상품 ID
        USER_ID,                                           -- 사용자 ID
        SALES_AMOUNT                                       -- 판매량
    FROM 
        ONLINE_SALE
    WHERE 
        SALES_DATE BETWEEN '2022-03-01' AND '2022-03-31' -- 2022년 3월 데이터만 포함

    UNION ALL

    SELECT 
        DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, -- 오프라인 판매 데이터의 판매 날짜
        PRODUCT_ID,                                        -- 상품 ID
        NULL AS USER_ID,                                   -- 오프라인 판매의 사용자 ID는 NULL로 설정
        SALES_AMOUNT                                       -- 판매량
    FROM 
        OFFLINE_SALE
    WHERE 
        SALES_DATE BETWEEN '2022-03-01' AND '2022-03-31' -- 2022년 3월 데이터만 포함
) AS COMBINED_SALES
ORDER BY 
    SALES_DATE ASC,                                       -- 판매 날짜 오름차순 정렬
    PRODUCT_ID ASC,                                       -- 상품 ID 오름차순 정렬
    USER_ID ASC;                                          -- 사용자 ID 오름차순 정렬 (NULL 포함)