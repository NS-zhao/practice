select sname,student.sno,cname,score into 成绩单
from student,sc,course
where student.sno = sc.sno
and course.cno = sc.cno
select * 
from 成绩单
