create database ͼ�����
on primary
(name='ͼ�����data1',
filename='E:\DATA\practice\2020 5\5\ͼ�����data1.mdf',
size=5mb,
maxsize=unlimited,
filegrowth=10%),
filegroup fg1
(name='ͼ�����data2',
filename='E:\DATA\practice\2020 5\5\ͼ�����data1.ndf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)
log on
(name='ͼ�����_log',
filename='E:\DATA\practice\2020 5\5\ͼ�����_log.ldf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)
