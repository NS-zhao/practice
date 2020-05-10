select sno,count(cno) Ñ¡ÐÞ¿Î³ÌÊý 
from sc
group by sno
having count(cno)>=2