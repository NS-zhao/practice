use teaching
select distinct student.sno,sname
from student,sc
where student.sno = sc.sno
         and cno in(select cno
                    from sc
                    where sno = '1404001')