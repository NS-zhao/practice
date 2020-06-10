create view 读者借阅信息
as
select 读者.姓名,借阅.*
from 读者,借阅
where 读者.学号 = 借阅.学号