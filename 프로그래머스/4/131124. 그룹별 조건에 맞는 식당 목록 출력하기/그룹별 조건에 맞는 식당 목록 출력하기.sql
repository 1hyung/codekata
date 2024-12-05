SELECT 
    MP.MEMBER_NAME,                  -- 회원 이름
    RR.REVIEW_TEXT,                  -- 리뷰 텍스트
    DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE -- 리뷰 작성일 (포맷 적용)
FROM 
    REST_REVIEW RR
JOIN 
    MEMBER_PROFILE MP
ON 
    RR.MEMBER_ID = MP.MEMBER_ID      -- 회원 ID를 기준으로 두 테이블 조인
WHERE 
    RR.MEMBER_ID = (                 -- 가장 리뷰를 많이 작성한 회원 ID를 서브쿼리로 구함
        SELECT 
            MEMBER_ID
        FROM 
            REST_REVIEW
        GROUP BY 
            MEMBER_ID
        ORDER BY 
            COUNT(*) DESC            -- 리뷰 수 기준 내림차순 정렬
        LIMIT 1                      -- 상위 1명만 선택
    )
ORDER BY 
    RR.REVIEW_DATE ASC,              -- 리뷰 작성일 기준 오름차순 정렬
    RR.REVIEW_TEXT ASC;              -- 리뷰 텍스트 기준 오름차순 정렬