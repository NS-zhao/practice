create table 读者
(读者编号 varchar(10) primary key,
 读者姓名 varchar(20) not null,
 读者性别 varchar(2)  not null  check(读者性别 in ('男','女')),
 读者年龄 varchar(2)  not null,
 读者邮箱 varchar(20) 
 )