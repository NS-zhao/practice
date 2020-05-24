use 图书借阅
select 书号,书名,定价
from 图书
where 类别 = '动画'
order by 出版社

select 出版社,sum(定价)总价钱
from 图书
where 类别 = '动画'
group by 出版社