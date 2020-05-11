select grade,specialty
from student,
(select sno
from sc
group by sno
having avg(score)>=80)ss
where student.sno = ss.sno
group by grade,specialty
having count(*)>=2