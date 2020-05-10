select specialty,ssex,count(*) as 'ÈËÊı'
from student
group by ssex,specialty
with cube