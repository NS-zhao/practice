USE teaching
SELECT * FROM student a  INNER JOIN student b  ON a.sname=b.sname AND a.sno<>b.sno
