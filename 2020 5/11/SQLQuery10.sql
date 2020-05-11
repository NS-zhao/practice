select sname,sage
from student
where ssex = 'Å®' and sage>all
(select sage
from student
where ssex = 'ÄÐ'
)