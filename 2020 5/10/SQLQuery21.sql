select sname
from student,sc
where cno = 'C001'and sc.sno = student.sno
union
select sname
from sc,student
where cno = 'C004'and sc.sno = student.sno
