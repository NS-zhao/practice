update sc set score = 86 
where sno = '1302001'
and cno = (select cno
           from course
		   where cname = '²Ù×÷ÏµÍ³')