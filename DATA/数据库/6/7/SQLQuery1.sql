create table 读者
(学生学号 varchar(10) primary key,
 学生姓名 varchar(20) not null,
 学生性别 varchar(2)  not null check(学生性别 = '男' or 学生性别 ='女'),
 学生年龄 varchar(2)  not null,
 学生专业 varchar(20) not null,
 学生班级 varchar(20) not null,
 学生邮箱 varchar(20)
 )