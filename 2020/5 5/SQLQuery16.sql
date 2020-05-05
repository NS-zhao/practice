USE teaching
SELECT * FROM student 
WHERE ssex='女' AND 
(specialty='计算机'
OR specialty='通信')
