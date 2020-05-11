select sname
from student
where exists
    (select * 
	from sc
	where sno = student.sno
	and cno = 'C004')