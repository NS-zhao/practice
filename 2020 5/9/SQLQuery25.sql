select specialty,ssex,count(*) as '����'
from student
group by ssex,specialty
with cube