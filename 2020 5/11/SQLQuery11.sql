select sname,sage,ssex
from student
where sage>(select sage from student where sname = '����')
and grade = (select grade from student where sname = '���ΰ')     
and specialty = (select specialty from student where sname = '���ΰ')   