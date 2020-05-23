use teaching
select student.sno,sname,sc.cno,score
from student right join sc
on student.sno = sc.sno