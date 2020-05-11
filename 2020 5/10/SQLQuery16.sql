select sname,specialty
from student
where sno in
          (select sno
		  from sc
		  where cno = 'C001')