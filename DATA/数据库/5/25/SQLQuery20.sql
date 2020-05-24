use teaching
select student.sno,sname
from student,sc
where student.sno = sc.sno and sc.cno = 'C001'