select ���,����,�۸�
from ͼ�� a
where �۸�>(select avg(�۸�)
            from ͼ�� b
            where a.��� = b.���
           )
order by ��� asc