SELECT a.hacker_id, a.name 
FROM hackers a
INNER JOIN submissions b
ON a.hacker_id = b.hacker_id
INNER JOIN challenges c
ON b.challenge_id = c.challenge_id
INNER JOIN difficulty d
ON c.difficulty_level=d.difficulty_level
WHERE b.score = d.score AND c.difficulty_level = d.difficulty_level
GROUP BY a.hacker_id, a.name
HAVING count(b.hacker_id) > 1
ORDER BY 
count(b.hacker_id) DESC,
a.hacker_id ASC