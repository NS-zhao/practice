select mname,year(getdate())-year(birthday) age
from manager
where stno = (select stno from store where address = '2��¥101')
