select 读者.*,罚款金额
from 读者 left join 违期处罚
on 读者.学号 = 违期处罚.学号
where 罚款金额 is not null