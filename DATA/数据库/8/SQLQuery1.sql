create database teaching
on primary
(name = 'teaching_data',
filename = 'E:\practice\DATA\���ݿ�\8\teaching_data.mdf',
size = 5MB,
maxsize = unlimited,
filegrowth = 10%)
log on
(name = 'teaching_log',
filename = 'E:\practice\DATA\���ݿ�\8\teaching_log.ldf',
size = 8MB,
maxsize = unlimited,
filegrowth = 10%)