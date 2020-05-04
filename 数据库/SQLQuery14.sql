USE STUDENT1
CREATE TABLE ST
(学号 char(6) PRIMARY KEY,
身份证号 char(18) UNIQUE,
姓名 nvarchar(8) NOT NULL,
专业名 nvarchar(10),
性别 nchar(1) CONSTRAINT chk_1 CHECK (性别='男' or 性别='女'),
出生时间 smalldatetime  NOT NULL,
总学分   tinyint,
入学日期 datetime  DEFAULT getdate() 
) 
