update sc set score = 92
from sc join student on
student.sno = sc.sno
where cno = 'C001'
and sname = '������' and grade = '13��' and specialty = '�����'