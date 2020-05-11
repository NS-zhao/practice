select b.cno,avg(b.score) as 平均分
from student a inner join sc b
on a.sno = b.sno and a.specialty = '计算机'
group by b.cno