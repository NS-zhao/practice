CREATE TABLE store
      (stno     char(3)   PRIMARY KEY,
      address	nvarchar(30)  NOT  NULL,
      telephone  varchar(11)  check(telephone like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]' ),
      capacity   smallint
     )
