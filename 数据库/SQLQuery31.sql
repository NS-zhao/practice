CREATE TABLE manager
(mno char(3) PRIMARY KEY,
mname nvarchar(10) NOT NULL,
sex nchar(1) CHECK (sex='ÄÐ' or sex='Å®'),
birthday date CHECK (birthday BETWEEN '1957-1-1' AND '2010-1-1'),
stno char(3) FOREIGN KEY REFERENCES store(stno)
)