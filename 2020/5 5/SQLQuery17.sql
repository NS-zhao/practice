create database 芞抎質堐
on primary
(name='芞抎質堐data1',
filename='E:\DATA\practice\2020 5\5\芞抎質堐data1.mdf',
size=5mb,
maxsize=unlimited,
filegrowth=10%),
filegroup fg1
(name='芞抎質堐data2',
filename='E:\DATA\practice\2020 5\5\芞抎質堐data1.ndf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)
log on
(name='芞抎質堐_log',
filename='E:\DATA\practice\2020 5\5\芞抎質堐_log.ldf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)
