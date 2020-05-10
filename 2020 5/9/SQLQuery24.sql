USE teaching
SELECT sno,sname,ssex 
FROM student 
WHERE specialty = '¼ÆËã»ú'
COMPUTE COUNT(sno)