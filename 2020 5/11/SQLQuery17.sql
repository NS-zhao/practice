select sno,sum(credit)��ѧ��
from sc,course
where sc.cno = course.cno
group by sno