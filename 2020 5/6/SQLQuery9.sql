USE STUDENT1
SELECT 学号,COUNT(课程号)选修课程数
FROM SC
GROUP BY 学号
HAVING COUNT(课程号)>=2