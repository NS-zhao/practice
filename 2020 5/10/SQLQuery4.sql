select b.cno,avg(b.score) as ƽ����
from student a inner join sc b
on a.sno = b.sno and a.specialty = '�����'
group by b.cno