select b.类别,avg(b.价格) 平均价格
from 图书 a inner join 图书 b
on a.书号 = b.书号
group by b.类别