SELECT IF(grades.grade<8, NULL, students.name) AS Sname, grades.grade, students.marks 
FROM students 
INNER JOIN grades 
WHERE students.marks BETWEEN grades.min_mark AND grades.max_mark 
ORDER BY grades.grade DESC, Sname, students.marks
