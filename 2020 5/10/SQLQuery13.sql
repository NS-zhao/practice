select student.sno,student.sname
from student,sc
where student.sno = sc.sno and cno = 'C001'
and score>(select score
           from sc
		   where cno='C001' and 
		   sno = (select sno
		          from student
				  where sname = 'Ö£Àö')
		  )