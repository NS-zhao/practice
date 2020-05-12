select *
from goods
where gno in
(select gno from invent where stno in
(select stno from manager where mname = 'ÀîÃ÷'))