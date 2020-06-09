select ½èÔÄ.Ñ§ºÅ,count(½èÔÄ.ÊéºÅ) ½èÔÄÍ¼ÊéÊýÄ¿
from ½èÔÄ
group by ½èÔÄ.Ñ§ºÅ
having count(½èÔÄ.ÊéºÅ)>=2