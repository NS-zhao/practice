select sno,sname
from student
where sage>=all 
(select sage
from student
where specialty = '�����')
and specialty = '�����'