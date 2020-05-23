use teaching 
select student.sno,sname,sc.score
from student join sc
on cno = 'C001' and score >= 90