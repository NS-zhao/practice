CREATE DATABASE inventory
on
(NAME = 'inventory_data', 
FILENAME = 'E:\practice\DATA\数据库\5\20\inventory_data.MDF' , 
SIZE = 10MB, 
FILEGROWTH = 20%)
LOG ON 
(NAME =' inventory_log', 
FILENAME = 'E:\practice\DATA\数据库\5\20\ inventory_log. LDF', 
SIZE = 2MB, 
MAXSIZE = 5MB,
FILEGROWTH = 1MB)
