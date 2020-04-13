USE inventory
GO
CREATE TABLE goods
(gno char(6) PRIMARY KEY,
gname nvarchar(10) NOT NULL,
price float NOT NULL,
producer nvarchar(30) NOT NULL,
)