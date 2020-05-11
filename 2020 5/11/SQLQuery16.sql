select top 5 sno,avg(score)Æ½¾ù³É¼¨
from sc
group by sno
order by avg(score) desc