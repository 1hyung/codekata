-- 상반기 아이스크림 맛을 총주문량을 기준으로 내림차순 정렬하고,
-- 총주문량이 같으면 출하 번호를 기준으로 오름차순 정렬하여 조회
SELECT 
    FLAVOR -- 아이스크림 맛
FROM 
    FIRST_HALF -- 데이터를 조회할 테이블
ORDER BY 
    TOTAL_ORDER DESC, -- 총주문량을 기준으로 내림차순 정렬
    SHIPMENT_ID ASC; -- 총주문량이 같을 경우 출하 번호를 기준으로 오름차순 정렬