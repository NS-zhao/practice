use teaching
select course.cno,COUNT(*) ѡ������
from course left join sc
on course.cno = sc.cno
group by course.cno