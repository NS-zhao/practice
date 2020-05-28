CREATE TABLE manager
      (mno     char(3)  PRIMARY KEY,
     mname	nvarchar(10)  NOT  NULL,
      sex     nchar(1)  check(sex in ('ÄÐ','Å®')),
      birthday  date  check(birthday between '19570101' and '20100101'), 
      stno  char(3)  foreign key references store(stno)
)
