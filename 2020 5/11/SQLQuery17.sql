select sno,sum(credit)×ÜÑ§·Ö
from sc,course
where sc.cno = course.cno
group by sno