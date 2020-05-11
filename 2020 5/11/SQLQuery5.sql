select cno,count(*)Ñ¡ÐÞÈËÊý
from sc
group by cno
having count(*)>2
order by count(*) desc,cno asc