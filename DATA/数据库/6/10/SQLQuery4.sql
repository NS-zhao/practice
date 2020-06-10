select 书号,书名,价格
from 图书 a
where 价格>(select avg(价格)
            from 图书 b
            where a.类别 = b.类别
           )
order by 书号 asc