create table Υ�ڴ���
(������� int primary key,
 ѧ��ѧ�� varchar(10) not null foreign key references ����(ѧ��ѧ��),
 ��� varchar(10) not null foreign key references ͼ��(���),
 �������� smallint not null,
 ������ float not null
 )