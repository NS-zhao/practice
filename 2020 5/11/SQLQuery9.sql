select sname,sage
from student
where ssex = 'Ů' and sage>(select avg(sage)
                            from student
							where ssex = '��'
						    )