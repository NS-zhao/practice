select cno,cname
from course
where cno not in(select cno
                 from sc
				  )