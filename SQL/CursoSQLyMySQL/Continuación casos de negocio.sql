###¿Cual es el promedio/desviación standard del precio de los libros?

#Los primeros 10 precios de mas caro a mas barato
SELECT title,price FROM books
ORDER BY price ASC LIMIT 10;

#Los primeros 10 precios de mas barato a mas caro
SELECT title, price FROM books
ORDER BY price DESC LIMIT 10;

