use 图书借阅
select 书号,书名,定价
from 图书
where 类别 = '动画'
compute count(书名),sum(定价)
