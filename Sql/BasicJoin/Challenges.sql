SELECT b.hacker_id, a.name, COUNT(b.challenge_id) AS count_challenge
FROM hackers a
INNER JOIN challenges b
ON a.hacker_id = b.hacker_id
GROUP BY b.hacker_id, a.name
HAVING
    /* output anyone with a count that is equal to... */
    count_challenge = 
        /* the max count that anyone has */
        (SELECT MAX(temp1.cnt)
        from (SELECT COUNT(hacker_id) as cnt
             from Challenges
             group by hacker_id
             order by hacker_id) temp1)
    /* or anyone who's count is in... */
    or count_challenge in 
        /* the set of counts... */
        (select t.cnt
         from (select count(*) as cnt 
               from challenges
               group by hacker_id) t
         /* who's group of counts... */
         group by t.cnt
         /* has only one element */
         having count(t.cnt) = 1)
ORDER BY count_challenge DESC, b.hacker_id ;