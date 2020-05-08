USE teaching
SELECT student.*,sc.cno,sc.score
FROM student LEFT JOIN sc
ON student.sno=sc.sno
