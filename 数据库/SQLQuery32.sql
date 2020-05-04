CREATE TABLE student1
(sno char(7) PRIMARY KEY,
sname nvarchar(10) NOT NULL,
grade nchar(3) NULL)

MERGE student AS d USING student AS s
ON s.sno = d.sno WHEN NOT MATCHED BY TARGET
THEN INSERT(sno,sname,grade)VALUES(s.sno,s.sname,s.grade)
WHEN NOT MATCHED BY SOURCE THEN DELETE
WHEN MATCHED THEN
UPDATE SET d.sname = s.sname,d.grade = s.grade;