create trigger 读者信息更新
on 读者
for insert,update,delete
as
print '读者信息更新成功'

