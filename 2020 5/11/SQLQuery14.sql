select sno,avg(score)ƽ���ɼ�
from sc
where score>=60
group by sno
having count(*)>=2
order by avg(score) desc