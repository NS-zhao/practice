use teaching
select sno,score80 = score*0.8
from sc
where cno = 'C001' and score between 80 and 90