create table 借阅
(借阅号 int primary key,
 书号 varchar(10) not null foreign key references 图书(书号),
 学生学号 varchar(10) not null  foreign key references 读者(学生学号),
 管理员编号 varchar(10) not null foreign key references 管理员(管理员编号),
 借书日期 datetime not null,
 还书日期 datetime
 )
 alter table 借阅
 add check(借书日期<=还书日期)