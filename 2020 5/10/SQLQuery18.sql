select sno,cno,score
from sc a
where score<(select avg(score)
             from sc b
			 where a.cno = b.cno)