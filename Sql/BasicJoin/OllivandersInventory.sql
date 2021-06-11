SELECT a.id, b.age, a.coins_needed, a.power 
FROM wands a
INNER JOIN wands_property b
ON a.code = b.code
WHERE b.is_evil <> 1 
AND a.coins_needed = 
    (SELECT min(coins_needed) 
    FROM wands c INNER JOIN wands_property D 
    ON c.code = d.code
    WHERE c.power = a.power
    AND d.age = b.age)
ORDER BY a.power DESC, b.age DESC