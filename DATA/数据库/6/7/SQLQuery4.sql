create table ����Ա
(����Ա��� varchar(10) primary key,
 ����Ա���� varchar(20) not null,
 ����Ա�˺� varchar(20) not null unique,
 ����Ա���� varchar(20) not null,
 ����Ա�Ա� varchar(2)  check(����Ա�Ա�='��'or ����Ա�Ա�='Ů'),
 ����Ա�绰 varchar(11) check(����Ա�绰 like 
    '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')
 )