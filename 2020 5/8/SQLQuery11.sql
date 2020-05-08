use STUDENT1
create table 学生1
(学号 char(6) primary key,
姓名 nvarchar(8) not null,
身份证号 char(18) constraint pk_st1 unique,
性别 nchar(1) not null)