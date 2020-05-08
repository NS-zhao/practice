use STUDENT1
create table 成绩
(学号 char(6) foreign key references 学生(学号),
课程号 char(4),
成绩 int)