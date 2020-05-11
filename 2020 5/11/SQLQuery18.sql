select a.sno,a.cno
from sc a,sc b
where b.score = (select min(score) from sc where a.cno = b.cno)
