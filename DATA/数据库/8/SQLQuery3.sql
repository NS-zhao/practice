create database STUDENT2
on primary
(name = 'STUDENT2_DATA',
filename = 'E:\practice\DATA\数据库\8\STUDENT2_DATA.MDF',
SIZE = 5MB,
maxsize = 20MB,
FILEGROWTH = 20%)
LOG ON
(NAME = 'STUDENT2_LOG',
FILENAME = 'E:\practice\DATA\数据库\8\STUDENT2_LOG.LDF',
SIZE = 5MB,
MAXSIZE = 10MB,
FILEGROWTH = 2MB)