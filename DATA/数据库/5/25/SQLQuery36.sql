use 图书借阅
select distinct 类别,avg(定价) 平均定价
from 图书
where 出版社 = '四叶草出版社'
group by 类别