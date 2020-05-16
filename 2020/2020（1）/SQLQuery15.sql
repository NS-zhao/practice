USE STUDENT1
CREATE TABLE SC
(学号 char (6) FOREIGN  KEY  REFERENCES ST(学号),
 课程号 char(4),
 成绩 int ,
 PRIMARY KEY(学号,课程号)
)
