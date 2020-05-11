select sno,cno,score
from sc
order by sno
compute avg(score) by sno