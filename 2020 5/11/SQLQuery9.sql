select sname,sage
from student
where ssex = 'Å®' and sage>(select avg(sage)
                            from student
							where ssex = 'ÄÐ'
						    )