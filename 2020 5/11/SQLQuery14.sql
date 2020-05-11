select sno,avg(score)Æ½¾ù³É¼¨
from sc
where score>=60
group by sno
having count(*)>=2
order by avg(score) desc