select top 5 sno,avg(score)ƽ���ɼ�
from sc
group by sno
order by avg(score) desc