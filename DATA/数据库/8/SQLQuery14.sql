use teaching
create table student
(sno char(7) primary key,
sname nvarchar(10) not null,
ssex nchar(1) not null,
sage tinyint,
en_time date,
specialty nvarchar(20),
grade nchar(3) not null)