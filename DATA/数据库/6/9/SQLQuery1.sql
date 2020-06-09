create database 学生图书借阅系统
on primary
(name = '学生图书借阅系统_data',
filename = 'E:\practice\DATA学生图书借阅系统_data.mdf',
size = 5MB,
maxsize = unlimited,
filegrowth = 20%)
log on
(name = '学生图书借阅系统_log',
filename = 'E:\practice\DATA学生图书借阅系统_log.ldf',
size = 5MB,
maxsize = 100MB,
filegrowth = 2MB)