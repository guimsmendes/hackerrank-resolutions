SELECT a.hacker_id, a.name, sum(score) AS total_score
FROM hackers a
INNER JOIN (SELECT hacker_id, max(score) AS score
            FROM submissions 
            GROUP BY hacker_id, challenge_id) b
ON a.hacker_id = b.hacker_id
GROUP BY a.hacker_id, a.name
HAVING total_score>0
ORDER BY total_score DESC, a.hacker_id