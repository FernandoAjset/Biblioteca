###¿Que nacionalidades hay?
#Con esta consulta se vienen todas las tuplas de la columna, incluso repetidas
SELECT nationality FROM authors; 

#Con esta consulta trae solo el listado con nacionalidades distintas, incluyendo NULL
SELECT DISTINCT nationality FROM authors BY ORDER nationality;

###¿Cuantos escritores hay de cada nacionalidad?
#Con esta consulta vamos a traer agrupadas la cantidad de escritores por nacionalidad
#ademas van a ser ordenadas por forma de mayor a menos DESC
SELECT nationality, count(author_id) AS c_authors
FROM authors
GROUP BY nationality
ORDER BY c_authors DESC
;

#Misma consulta de arriba con la modificación que las nacionalidades que tengan
#la misma cantidad de registros se van a ordenar mediante el parametro nationality
SELECT nationality, count(author_id) AS c_authors
FROM authors
GROUP BY nationality
ORDER BY c_authors DESC, nationality ASC
;

#Misma consulta de arriba, eliminando los NULL
SELECT nationality, count(author_id) AS c_authors
FROM authors
WHERE nationality IS NOT NULL
GROUP BY nationality
ORDER BY c_authors DESC, nationality ASC
;

#Misma consulta, siendo mas puntuales porque se exceptua a RUS y AUS
SELECT nationality, count(author_id) AS c_authors
FROM authors
WHERE nationality IS NOT NULL
    AND nationality NOT IN('RUS','AUS')
GROUP BY nationality
ORDER BY c_authors DESC, nationality ASC
;

#Consulta que solo trae a RUS y AUS, cambiando el NOT IN por IN
SELECT nationality, count(author_id) AS c_authors
FROM authors
WHERE nationality IS NOT NULL
    AND nationality IN('RUS','AUS')
GROUP BY nationality
ORDER BY c_authors DESC, nationality ASC
;







