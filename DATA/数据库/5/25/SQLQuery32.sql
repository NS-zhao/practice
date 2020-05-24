use 图书借阅
select 书号,书名,定价,count(*) 总册数,sum(定价) 总价格
from 图书
where 类别 = '动画'
group by 书号,书名,定价
