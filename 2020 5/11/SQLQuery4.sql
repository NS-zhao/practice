select course.cno,avg(score) Æ½¾ù³É¼¨
from course,sc
where credit = 3 and course.cno = sc.cno
group by course.cno