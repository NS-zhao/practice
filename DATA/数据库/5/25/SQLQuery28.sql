use teaching
select sname
from student
where sno not in(select sno
                 from sc
                 where cno = 'E002')