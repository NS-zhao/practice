create trigger 图书信息更新
on 图书
for insert,update,delete
as
print '图书信息更新成功'