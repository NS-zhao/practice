use teaching
select student.sno,sname,count(cno) ѡ�޿γ���
from student full join sc
on student.sno = sc.sno
group by student.sno,sname