create view 读者借阅信息
as
select 读者.姓名,借阅.*
from 读者,借阅
where 读者.读者编号 = 借阅.读者编号