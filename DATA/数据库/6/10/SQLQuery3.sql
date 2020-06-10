select 学号,姓名
from 读者
where 年龄>=all
(select 年龄  from 读者  where 专业 = '电子商务')
and 专业 = '电子商务'