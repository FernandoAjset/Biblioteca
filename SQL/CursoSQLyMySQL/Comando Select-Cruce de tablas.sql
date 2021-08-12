#CONSULTA DE PRIMEROS 5 TUPLAS USANDO BETWEEN
SELECT book_id, author_id, title FROM books WHERE author_id BETWEEN 1 AND 5;

#CONSULTA CRUZANDO TABLAS Y USANDO TABLAS (SQL JOINS)
SELECT b.book_id, a.name, a.author_id, b.title 
FROM books as b
JOIN authors as a
    ON a.author_id=b.author_id
WHERE a.author_id BETWEEN 1 AND 5;    

#SELECCIONAR NOMBRE DE AUTOR CON ID=4
SELECT name FROM authors
WHERE author_id=4;

#INSERTANDO VARIAS TUPLAS EN TRANSACTIONS
INSERT INTO transactions(book_id,client_id,type,finished)
VALUES(12,34,'sell',1),
    (54,87,'lend',0),
    (3,14,'sell',1),
    (1,54,'sell',1),
    (12,81,'lend',1),
    (12,81,'return',1),
    (87,29,'sell',1)        
    ;
#ELIMINAR TUPLA DE TRANSACTION USANDO CONDISIONAL
    DELETE FROM transactions where book_id=1;

#MODIFICAR CAMPO 'TYPE' DE LA TABLA TRANSACTIONS
ALTER TABLE transactions MODIFY type ENUM('sell','lend','return');

#CONSULTA CRUZANDO VARIAS TABLAS, USANDO ALIAS
SELECT c.name, b.title, a.name, t.type
FROM transactions as t
JOIN books as b
    ON t.book_id=b.book_id
JOIN clients as c
    ON t.client_id=c.client_id
JOIN authors as a
    ON b.author_id=a.author_id
WHERE c.gender='M'
AND t.type IN ('sell','lend')    
;    