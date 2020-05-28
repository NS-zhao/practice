CREATE TABLE invent
      (stno   char(3)  foreign key references store(stno),
      gno	 char(6)  foreign key references goods(gno),
      number   int,
     primary key(stno,gno)
   )
