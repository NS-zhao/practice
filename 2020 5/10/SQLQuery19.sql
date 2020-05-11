select sno,sname,grade,specialty
from student
where(select count(*)
     from sc
	 where sc.sno = student.sno
	 and score>=80)>=2