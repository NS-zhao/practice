select producer,sum(number) �������
from goods,invent
where goods.gno = invent.gno
group by producer