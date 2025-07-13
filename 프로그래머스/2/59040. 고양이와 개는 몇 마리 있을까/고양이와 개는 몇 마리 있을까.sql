-- 고양이와 개는 몇 마리 있을까
-- 동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성
-- 고양이를 개보다 먼저 조회
select
    ANIMAL_TYPE, -- 동물의 종
    count(*) as count -- 해당 동물의 수 
from
    ANIMAL_INS -- 데이터를 조회할 테이블 
where 
    ANIMAL_TYPE in ('Cat', 'Dog') -- 고양이와 개만 필터링
group by 
    ANIMAL_TYPE -- 동물의 종으로 그룹화 
order by
    field(ANIMAL_TYPE, 'Cat', 'Dog'); -- 고양이를 먼저, 개를 나중에 정렬