USE ͼ�����
CREATE TABLE ����
(���߱�� nchar(10) PRIMARY KEY,
���� char(10) NOT NULL,
��λ nchar(10) NOT NULL,
�Ա� nchar(10) NOT NULL CHECK(�Ա�='��' or �Ա�='Ů'),
�绰 nvarchar(11) NOT NULL CHECK(�绰 like '[0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9] [0-9]')
)

