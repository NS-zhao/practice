use teaching
select student.sno,sname,count(cno) Ñ¡ĞŞ¿Î³ÌÊı
from student full join sc
on student.sno = sc.sno
group by student.sno,sname