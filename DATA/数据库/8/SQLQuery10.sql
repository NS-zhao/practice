CREATE DATABASE Student
ON PRIMARY
(NAME = 'Student1_data',
FILENAME = 'E:\practice\DATA\数据库\8\Student1_data.mdf',
SIZE = 20MB),
FILEGROUP FG1
(NAME = 'Student2_data',
FILENAME = 'E:\practice\DATA\数据库\8\Student2_data.ndf',
size = 20MB),
(NAME = 'Student3_data',
FILENAME = 'E:\practice\DATA\数据库\8\Student3_data',
SIZE = 20MB)
LOG ON
(NAME = 'Student_LOG',
FILENAME = 'E:\practice\DATA\数据库\8\Student_LOG',
SIZE = 20MB)