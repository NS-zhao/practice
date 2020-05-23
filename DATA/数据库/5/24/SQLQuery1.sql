create database 图书借阅
on primary
(name='图书借阅data1',
filename='E:\practice\DATA\数据库\5\24\图书借阅data1.mdf',
size=5mb,
maxsize=unlimited,
filegrowth=10%),
filegroup fg1
(name='图书借阅data2',
filename='E:\practice\DATA\数据库\5\24\图书借阅data1.ndf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)
log on
(name='图书借阅_log',
filename='E:\practice\DATA\数据库\5\24\图书借阅_log.ldf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)