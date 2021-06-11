
SELECT
    CASE WHEN A + B > C THEN
        CASE WHEN A = B and B= C THEN
        'Equilateral'
            WHEN A <> B AND B <> C AND A<> C then
       'Scalene'
         ELSE
        'Isosceles'
       END
       ELSE
       'Not A Triangle' END from triangles