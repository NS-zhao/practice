select sname,sage
from student
where ssex = 'Ů' and sage>all
(select sage
from student
where ssex = '��'
)