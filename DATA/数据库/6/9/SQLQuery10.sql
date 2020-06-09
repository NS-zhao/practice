select 类别,avg(价格) 平均价格,count(借阅.书号) 借阅人数
from 借阅,图书
where 借阅.书号 = 图书.书号
group by 类别
with cube