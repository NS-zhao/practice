alter view inve_count
as
select goods.gno,gname,sum(number) snumber,count(stno) storenum
from goods,invent
where goods.gno = invent.gno
group by goods.gno,gname
