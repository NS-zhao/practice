CREATE TABLE invent
(stno char(3) NOT NULL FOREIGN KEY REFERENCES store (stno),
gno char(6) NOT NULL FOREIGN KEY REFERENCES goods (gno),
number int,
PRIMARY KEY (stno, gno)
)