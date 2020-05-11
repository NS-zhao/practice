select sno,sname
from student
where sage>=all 
(select sage
from student
where specialty = '计算机')
and specialty = '计算机'