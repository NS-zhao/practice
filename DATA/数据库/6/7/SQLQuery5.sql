create table ����
(���ĺ� int primary key,
 ��� varchar(10) not null foreign key references ͼ��(���),
 ѧ��ѧ�� varchar(10) not null  foreign key references ����(ѧ��ѧ��),
 ����Ա��� varchar(10) not null foreign key references ����Ա(����Ա���),
 �������� datetime not null,
 �������� datetime
 )
 alter table ����
 add check(��������<=��������)