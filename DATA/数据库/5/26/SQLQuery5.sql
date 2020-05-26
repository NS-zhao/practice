create view 动漫类图书借阅
as
select 图书.类别,借阅.*
from 图书,借阅
where 图书.书号 = 借阅.书号 and 类别 = '动漫'