update sc set score = 92
where cno = 'C001'
and sno = (select sno
          from student
		  where sname = '������'
		  and grade = '13��' and specialty = '�����')