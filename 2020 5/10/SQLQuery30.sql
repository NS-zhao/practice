update sc set score = 92
where cno = 'C001'
and sno = (select sno
          from student
		  where sname = '张明明'
		  and grade = '13级' and specialty = '计算机')