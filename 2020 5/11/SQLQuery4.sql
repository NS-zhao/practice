select course.cno,avg(score) ƽ���ɼ�
from course,sc
where credit = 3 and course.cno = sc.cno
group by course.cno