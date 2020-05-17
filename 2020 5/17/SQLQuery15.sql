use inventory
go
create view goodscount
as
select goods.gno,goods.gname,snumber,snumber*price as sumprice
from goods,inve_count
where goods.gno = inve_count.gno
