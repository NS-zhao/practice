create table 成绩表
(学号 char(7),
课程号 char(4),
成绩 int)
insert into 成绩表(学号,课程号,成绩)
select *
from sc
where score>=80
select * 
from 成绩表