CREATE DATABASE inventory
ON PRIMARY
(NAME = 'inventory_data',
FILENAME = 'E:\practice\DATA\数据库\8\inventory_data.mdf',
SIZE = 10MB,
MAXSIZE = UNLIMITED,
FILEGROWTH = 20%)
LOG ON
(NAME = 'inventory_log',
FILENAME = 'E:\practice\DATA\数据库\8\inventory_log.ldf',
size = 2mb,
maxsize = 5mb,
FILEGROWTH = 1MB)