select *
from student
where specialty not in ('计算机')
      and  sage<(select MAX(sage)
           from student
           where specialty = '计算机')