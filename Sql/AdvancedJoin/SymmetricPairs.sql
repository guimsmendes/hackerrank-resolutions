SELECT a.X, a.Y
FROM Functions a
INNER JOIN Functions b
ON a.X = b.Y AND a.Y = b.X
GROUP BY a.X, a.Y
HAVING count(a.X) > 1 OR a.X<a.Y
ORDER BY a.X
