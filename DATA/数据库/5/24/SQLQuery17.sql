use teaching
select course.cno,COUNT(*) Ñ¡¿ÎÈËÊı
from course left join sc
on course.cno = sc.cno
group by course.cno