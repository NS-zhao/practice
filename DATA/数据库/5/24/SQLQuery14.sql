use teaching
select student.*,sc.cno
from student left join sc
on student.sno = sc.sno