select sno
from sc
where cno = 'C001' and score = (select max(score) from sc where cno = 'C001')