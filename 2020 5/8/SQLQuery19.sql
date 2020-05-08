use STUDENT1
create table books
(book_id char(15) primary key,
book_name nvarchar(30) not null,
max_lv1 tinyint not null check(max_lv1<=250)
)