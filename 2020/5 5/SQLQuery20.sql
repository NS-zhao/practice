CREATE TABLE 借阅
(书号 nchar(10) FOREIGN KEY REFERENCES 图书(书号),
读者编号  nchar(10) NOT NULL FOREIGN KEY REFERENCES 读者(读者编号),
借书日期  date NOT NULL,
还书日期  date NOT NULL,
PRIMARY KEY(书号,读者编号)
)
