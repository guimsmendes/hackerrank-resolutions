SELECT a.name
FROM students a
INNER JOIN friends b
on a.id=b.id
INNER JOIN packages c
on a.id=c.id
INNER JOIN packages d
on b.friend_id=d.id
WHERE d.salary > c.salary
ORDER BY d.salary