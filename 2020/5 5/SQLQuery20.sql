CREATE TABLE ����
(��� nchar(10) FOREIGN KEY REFERENCES ͼ��(���),
���߱��  nchar(10) NOT NULL FOREIGN KEY REFERENCES ����(���߱��),
��������  date NOT NULL,
��������  date NOT NULL,
PRIMARY KEY(���,���߱��)
)
