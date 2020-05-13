create view avgscore
as
select student.sno,sname,avg(score) avgscore
from student,sc
where student.sno = sc.sno
group by student.sno,sname
