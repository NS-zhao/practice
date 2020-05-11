update sc set score = 92
from sc join student on
student.sno = sc.sno
where cno = 'C001'
and sname = '张明明' and grade = '13级' and specialty = '计算机'