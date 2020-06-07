create table 图书
(书号 varchar(10) primary key,
 书名 varchar(20) not null,
 类别 varchar(20),
 作者 varchar(20),
 价格 float,
 出版社 varchar(20),
 总数 tinyint not null,
 剩余 tinyint not null 
 )
 alter table 图书
 add check(剩余<=总数)