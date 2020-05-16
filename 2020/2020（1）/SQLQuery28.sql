CREATE TABLE store
(stno char(3) PRIMARY KEY,
address nvarchar (30) NOT NULL,
telephone varchar(11) CHECK (telephone LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'),
capacity smallint)
