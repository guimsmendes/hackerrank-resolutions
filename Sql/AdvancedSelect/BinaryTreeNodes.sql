SELECT N, CASE
            WHEN P IS NULL THEN
                'Root'
            WHEN (SELECT COUNT(*) FROM BST WHERE P = B.N) = 0  THEN
                'Leaf'
            ELSE
                'Inner'
        END
            
            
FROM BST AS B
ORDER BY N