create database ͼ�����
on primary
(name='ͼ�����data1',
filename='E:\practice\DATA\���ݿ�\5\24\ͼ�����data1.mdf',
size=5mb,
maxsize=unlimited,
filegrowth=10%),
filegroup fg1
(name='ͼ�����data2',
filename='E:\practice\DATA\���ݿ�\5\24\ͼ�����data1.ndf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)
log on
(name='ͼ�����_log',
filename='E:\practice\DATA\���ݿ�\5\24\ͼ�����_log.ldf',
size=5mb,
maxsize=unlimited,
filegrowth=10%)