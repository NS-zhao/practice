create view g_s_score
as
select grade,specialty,cno,avg(score) ƽ���ɼ�
from student,sc
where student.sno = sc.sno
group by grade,specialty,cno