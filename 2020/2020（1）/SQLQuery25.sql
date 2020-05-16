CREATE DATABASE inventory
ON PRIMARY
(NAME = inventory_data,
FILENAME = 'E:\DATA\2020 5 4\inventory_data.MDF',
SIZE = 10MB,
MAXSIZE = unlimited,
FILEGROWTH = 20%)
LOG ON
(NAME = inventory_log,
FILENAME = 'E:\DATA\2020 5 4\inventory_log.LDF',
SIZE =2MB,
MAXSIZE = 5MB,
FILEGROWTH = 1MB)