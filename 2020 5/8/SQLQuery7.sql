use teaching
create table sc
(sno char(7),
cno char(4),
score int,
constraint pk_js primary key(sno,cno)
)