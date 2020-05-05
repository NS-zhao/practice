USE 图书借阅
CREATE TABLE 读者
(读者编号 nchar(10) PRIMARY KEY,
姓名 char(10) NOT NULL,
单位 nchar(10) NOT NULL,
性别 nchar(10) NOT NULL CHECK(性别='男' or 性别='女'),
电话 nvarchar(11) NOT NULL CHECK(电话 like '[0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9]')
)

