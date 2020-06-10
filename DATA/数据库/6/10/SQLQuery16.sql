create procedure 读者姓名
@读者姓名 char (10)
as 
Select 学号,账号,密码,姓名,性别,年龄,专业,班级,邮箱,电话
from 读者
Where 姓名 = @读者姓名
