select *
from student
where specialty not in ('�����')
      and  sage<(select MAX(sage)
           from student
           where specialty = '�����')