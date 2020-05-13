create view computer_stu
as
select sno,sname,ssex,sage,en_time,specialty,grade
from student
where specialty = '¼ÆËã»ú'