use teaching
go
create view ƽ���ɼ�
as
select student.sno,sname,avg(score) ƽ���ɼ�
from student,sc
where student.sno = sc.sno
group by student.sno,sname
