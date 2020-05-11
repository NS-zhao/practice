select * 
from student a inner join student b
on a.sname = b.sname and a.sno<>b.sno