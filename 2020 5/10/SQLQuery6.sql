select student.*,sc.cno,sc.score
from student left join sc
on student.sno = sc.sno