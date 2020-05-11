select sno,sname,specialty
from student
where specialty=
(select specialty
from student
where sname = 'Щђбо')