select sname
from sc,student
where cno = 'C001' and sc.sno = student.sno
intersect
select sname
from sc,student
where cno = 'C004' and sc.sno = student.sno