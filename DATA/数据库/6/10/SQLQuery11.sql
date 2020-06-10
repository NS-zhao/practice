create procedure 图书编号
@书号 varchar (10)
as 
Select 书号,书名,类别,作者,价格, 出版社,总数,剩余
from 图书
where 书号 = @书号
