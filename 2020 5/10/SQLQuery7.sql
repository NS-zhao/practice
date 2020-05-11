select course.*,sc.score,student.sname,student.sno
from course left join sc 
on course.cno=sc.cno
full join student on student.sno = sc.sno