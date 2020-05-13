create view s_c_sc
as
select student.sno,sname,course.cno,cname,score
from student,course,sc
where student.sno = sc.sno
and course.cno = sc.cno
and specialty = '¼ÆËã»ú'