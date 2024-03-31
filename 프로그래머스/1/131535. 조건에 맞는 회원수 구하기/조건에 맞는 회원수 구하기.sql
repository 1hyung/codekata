SELECT count(USER_ID) users
from USER_INFO 
where year(JOINED) = '2021' and age >= 20 and age <= 29