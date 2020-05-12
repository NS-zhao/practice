select producer,sum(number) ¿â´æ×ÜÁ¿
from goods,invent
where goods.gno = invent.gno
group by producer