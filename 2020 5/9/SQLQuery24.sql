USE teaching
SELECT sno,sname,ssex 
FROM student 
WHERE specialty = '�����'
COMPUTE COUNT(sno)