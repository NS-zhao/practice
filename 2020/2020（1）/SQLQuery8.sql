USE STUDENT1   
CREATE TABLE XS
 (学号 char(12)  PRIMARY KEY,
  姓名 char(20) ,
  性别 nchar(1)  CONSTRAINT  chk_sex CHECK(性别 ='男'  or 性别 = '女')
 )
