#HACIENDO JOIN Y SUANDO ORDER BY DE FORMA DESCENDENTE USANDO AUTHOR ID
SELECT a.author_id, a.name, a.nationality, b.title
FROM authors as a
JOIN books as b
    ON b.author_id=a.author_id
WHERE a.author_id between 1 and 5
ORDER BY a.author_id desc;

#HACIENDO JOIN Y SUANDO ORDER BY DE FORMA DESCENDENTE USANDO NOMBRE
SELECT a.author_id, a.name, a.nationality, b.title
FROM authors as a
JOIN books as b
    ON b.author_id=a.author_id
WHERE a.author_id between 1 and 5
ORDER BY a.name desc;

#HACIENDO LEFT JOIN CON LA CONSULTA ANTERIOR
SELECT a.author_id, a.name, a.nationality, b.title
FROM authors as a
LEFT JOIN books as b
    ON b.author_id=a.author_id
WHERE a.author_id between 1 and 5
ORDER BY a.author_id asc;

#CONTANDO CUANTOS LIBROS TIENE CADA AUTOR, USANDO GROUP BY
SELECT a.author_id, a.name, a.nationality, COUNT(b.book_id) Cantidad
FROM authors as a
LEFT JOIN books as b
    ON b.author_id=a.author_id
WHERE a.author_id between 1 and 5
GROUP BY a.author_id 
ORDER BY a.author_id asc;

#MISMA CONSULTA ANTERIOR SIN EL LEFT JOIN, PODEMOS VER QUE NO MOSTRARA LOS QUE TIENEN CERO LIBROS
SELECT a.author_id, a.name, a.nationality, COUNT(b.book_id) Cantidad
FROM authors as a
JOIN books as b
    ON b.author_id=a.author_id
WHERE a.author_id between 1 and 5
GROUP BY a.author_id 
ORDER BY a.author_id asc;