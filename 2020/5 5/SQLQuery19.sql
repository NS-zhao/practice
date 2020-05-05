CREATE TABLE 图书
(书号 nchar(10) PRIMARY KEY,
书名 nvarchar(20) NOT NULL,
作者 nvarchar(10) NOT NULL,
类别 nvarchar(20) NOT NULL,
出版社 nvarchar(20) NOT NULL,
定价 money NOT NULL,
UNIQUE(书名,作者))
