use STUDENT1
alter table 学生
add 入学日期 date null
constraint df_date
default getdate()