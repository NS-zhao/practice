CREATE DATABASE Student
ON PRIMARY
(NAME = Student1,
FILENAME = 'E:\DATA\2020 5 4\Student1.mdf',
SIZE = 20MB),
FILEGROUP FG1
(NAME = Student4,
FILENAME = 'E:\DATA\2020 5 4\Student4.ndf',
SIZE = 20MB),
(NAME = Student3,
FILENAME = 'E:\DATA\2020 5 4\Student3.ndf',
SIZE = 20MB)
LOG ON
(NAME = Student1_log,
FILENAME = 'E:\DATA\2020 5 4\Student1_log.ldf',
SIZE = 10MB),
(NAME = Student2,
FILENAME = 'E:\DATA\2020 5 4\Student2_log.ldf',
SIZE = 10MB)