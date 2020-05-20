CREATE  DATABASE  Student
ON
(NAME=Student1,
FILENAME='E:\practice\DATA\数据库\5\20\Student1.MDF',
SIZE=20,
MAXSIZE=unlimited),
FILEGROUP FG1
(NAME= Student2,
FILENAME='E:\practice\DATA\数据库\5\20\Student2.NDF',
SIZE=30,
MAXSIZE= unlimited),
(NAME= Student3,
FILENAME='E:\practice\DATA\数据库\5\20\Student3.NDF',
SIZE=30,
MAXSIZE= unlimited)
LOG ON 
(NAME=Studentlog1,
FILENAME='E:\practice\DATA\数据库\5\20\Studentlog1.LDF',
SIZE=10,
MAXSIZE= unlimited),
(NAME=Studentlog2,
FILENAME='E:\practice\DATA\数据库\5\20\Studentlog2.LDF',
SIZE=10,
MAXSIZE= unlimited)

