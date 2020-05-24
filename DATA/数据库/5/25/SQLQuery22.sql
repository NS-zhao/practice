use teaching
select sno,sname
from student
where sno = 
(select sno
 from sc
 where cno = 'R005')