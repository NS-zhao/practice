create table ����
(���߱�� varchar(10) primary key,
 �������� varchar(20) not null,
 �����Ա� varchar(2)  not null  check(�����Ա� in ('��','Ů')),
 �������� varchar(2)  not null,
 �������� varchar(20) 
 )