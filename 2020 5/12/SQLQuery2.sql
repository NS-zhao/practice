use inventory
go
create view inve_count
as
select goods.gno,gname,sum(number) snumber
from goods,invent
where goods.gno = invent.gno
group by goods.gno,gname
