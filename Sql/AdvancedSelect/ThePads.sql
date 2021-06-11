SELECT CONCAT(name,"(",SUBSTRING(occupation,1,1),")") FROM occupations ORDER BY name

SELECT "There are a total of ", count(OCCUPATION), concat(lower(occupation),"s.")  FROM occupations GROUP BY occupation ORDER BY count(occupation)