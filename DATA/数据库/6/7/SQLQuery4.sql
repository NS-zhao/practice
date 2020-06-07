create table 管理员
(管理员编号 varchar(10) primary key,
 管理员姓名 varchar(20) not null,
 管理员账号 varchar(20) not null unique,
 管理员密码 varchar(20) not null,
 管理员性别 varchar(2)  check(管理员性别='男'or 管理员性别='女'),
 管理员电话 varchar(11) check(管理员电话 like 
    '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')
 )