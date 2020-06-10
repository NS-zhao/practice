create view 图书_count
as
select 类别,sum(剩余) 剩余量
from 图书
group by 类别
