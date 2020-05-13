create view g_s_score
as
select grade,specialty,cno,avg(score) Æ½¾ù³É¼¨
from student,sc
where student.sno = sc.sno
group by grade,specialty,cno