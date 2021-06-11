SELECT sum(city.population)
FROM city
INNER JOIN country
WHERE city.countrycode = country.code AND country.continent = 'Asia'