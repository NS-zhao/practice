CREATE DATABASE Student
ON
(NAME = Student,
FILENAME = 'E:\DATA\Student.mdf',
SIZE = 20MB),
FILEGROUP FILEG1
(NAME = Student1,
FILENAME = 'E:\DATA\Student1.mdf',
SIZE = 20MB),
FILEGROUP FILEG2
(NAME = Student2,
FILENAME = 'E:\DATA\Student2.mdf',
SIZE = 20MB)
LOG ON
(NAME = Student_log,
FILENAME = 'E:\DATA\Student_log.ndf',
SIZE = 10MB),
(NAME = Student_log1,
FILENAME = 'E:\DATA\Student_log1.ndf',
SIZE = 10MB)