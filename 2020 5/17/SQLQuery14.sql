use inventory
go
alter view inve_count
as
select goods.gno,gname,sum(number) as snumber,count(stno) as storenum
from goods,invent
where goods.gno = invent.gno
group by goods.gno,gname