use teaching
go
create view 平均成绩
as
select student.sno,sname,avg(score) 平均成绩
from student,sc
where student.sno = sc.sno
group by student.sno,sname
