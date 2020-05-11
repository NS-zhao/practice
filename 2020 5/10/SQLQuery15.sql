select *
from student
where sage=any(select sage
     from student
	 where specialty = 'м╗пе')