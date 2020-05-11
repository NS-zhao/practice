select student.sno,student.sname,course.cno,course.cname,sc.score
from student join sc 
on student.sno = sc.sno and sc.score>75
join course on course.cno = sc.cno