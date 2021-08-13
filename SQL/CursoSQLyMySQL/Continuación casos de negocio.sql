###¿Cual es el promedio/desviación standard del precio de los libros?

#Los primeros 10 precios de mas caro a mas barato
SELECT title,price FROM books
ORDER BY price ASC LIMIT 10;

#Los primeros 10 precios de mas barato a mas caro
SELECT title, price FROM books
ORDER BY price DESC LIMIT 10;

#Promedio de los precios y desviación estandar, agrupado por nacionalidad y que nacionalidad tiene mas a menos
SELECT nationality, COUNT(book_id) AS libros, AVG(price) AS prom, 
    STDDEV(price) AS std
FROM books AS b
JOIN authorS AS a
    ON a.author_id=b.author_id
GROUP BY nationality
ORDER BY libros DESC;

###¿Cual es el precio maximo/minimo de un libro?
#Precio maximo y minimo agrupado por nacionalidad
SELECT nationality, MAX(price), MIN(price)
FROM books AS b
JOIN authors AS a
    ON a.author_id=b.author_id
GROUP BY nationality;

#Reporte final de transaccion
SELECT c.name, t.type, b.title, a.name, a.nationality 
FROM transactions AS t
LEFT JOIN clients AS c
    ON c.client_id=t.client_id
LEFT JOIN books AS b
    ON b.book_id=t.book_id
LEFT JOIN authors AS a
    ON b.author_id=a.author_id
;

#Concatenar campos
SELECT c.name, t.type, b.title, 
    CONCAT(a.name, " (",a.nationality,")") as Autor 
FROM transactions AS t
LEFT JOIN clients AS c
    ON c.client_id=t.client_id
LEFT JOIN books AS b
    ON b.book_id=t.book_id
LEFT JOIN authors AS a
    ON b.author_id=a.author_id
;

#Funcion TO_DAYS(), para ver cuantos dias ha pasado desde que se rento un libro hasta hoy
SELECT c.name, t.type, b.title, 
    CONCAT(a.name, " (",a.nationality,")") as Autor, 
    TO_DAYS(NOW())-TO_DAYS(t.created_at) AS ago
FROM transactions AS t
LEFT JOIN clients AS c
    ON c.client_id=t.client_id
LEFT JOIN books AS b
    ON b.book_id=t.book_id
LEFT JOIN authors AS a
    ON b.author_id=a.author_id
;
