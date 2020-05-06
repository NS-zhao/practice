SELECT 课程号,AVG(成绩) AS '平均成绩',COUNT(学号) AS '选修人数'
FROM SC
GROUP BY 课程号
WITH CUBE