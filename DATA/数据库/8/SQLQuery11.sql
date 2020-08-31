USE teaching
CREATE TABLE course
(cno char(4) primary key,
cname nvarchar(20) not null,
classhour tinyint,
credit tinyint)