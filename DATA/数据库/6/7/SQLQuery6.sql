create table 违期处罚
(处罚编号 int primary key,
 学生学号 varchar(10) not null foreign key references 读者(学生学号),
 书号 varchar(10) not null foreign key references 图书(书号),
 超期天数 smallint not null,
 罚款金额 float not null
 )