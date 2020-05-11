select sname,sage,ssex
from student
where sage>(select sage from student where sname = 'ÉòÑŞ')
and grade = (select grade from student where sname = 'ÀîºêÎ°')     
and specialty = (select specialty from student where sname = 'ÀîºêÎ°')   