select top 1 stno
from invent
group by stno
order by sum(number) asc