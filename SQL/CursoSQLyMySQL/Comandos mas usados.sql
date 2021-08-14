SHOW databases; - muestra las bases de datos existentes.
USE database_name; - selecciona una base de datos específica.
SHOW tables; - muestras las tablas de la base de datos.
SELECT database(); - me muestra el nombre de la base de datos seleccionada.
CREATE database database_name; - crea una nueva base de datos.
CREATE DATABASE IF NOT EXISTS database_name; - crea una base de datos si no existe.
SHOW warnings; - muestra las advertencias.
DROP table table_name; - Elimina permanentemente una tabla.
DESCRIBE table_name; - Nos indica las columnas que tenemos en una tabla.
SHOW FULL COLUMNS FROM table_name; - es parecido al comando DESCRIBE pero muestra mas datos.
INSERT INTO table_name(columns) VALUES(values); - inserta una tupla.
ON DUPLICATE KEY IGNORE ALL - esta sentencia ignora las resticciones al insertar una tupla
con un valor repetido y que esta restringido en una columna con UNIQUE (Nota: nunca utilizarlo).
ON DUPLICATE KEY UPDATE column = VALUES(value) - al insertar una tupla con un campo duplicado
actualiza un el valor de un campo específico con un nuevo valor tomado de los datos insertados.
SELECT * FROM table_name WHERE column_value = 1\G - en lugar de cerrar la sentencia con ;
se utiliza \G, lo cual muestra los datos de una manera mas legible.
mysql -u root -p < all_schema.sql - con este comando podemos ejecutar un script SQL inmediatamente
despues de acceder a la base de datos.
mysql -u root -p -D database_name < all_schema.sql - este comando es parecido al anterior solo
que con la bandera -D indicamos el nombre de la base de datos sobre la que queremos ejecutar el script.
SELECT YEAR(NOW()); - esta sentencia me muestra el año de la fecha actual utilizando las funciones YEAR() y NOW().
SELECT * FROM table_name WHERE column_value like ‘%value%’; - esta sentencia nos muestra las tuplas que en un
campo específico contengan un valor, el wildcard % indica que no nos importa que valor existan antes o despues del
dato que especificamos.
SELECT COUNT(*) FROM table_name; - devuelve el número de tuplas de una tabla.
SELECT * FROM table_name WHERE column_value BETWEEN value AND value; - nos devuelve las tuplas que se encuentren
en medio de los valores indicados.
DELETE FROM table_name WHERE column_value = value; - elimina una tupla de una tabla.
UPDATE table_name SET [column_value = value, …] WHERE column_value = value; - actualiza una tupla de una tabla.
TRUNCATE table_name; - borra todo el contenido de una tabla.
mysqldump -u user -p database_name > esquema.sql - guarda el esquema de una base de datos con todo y datos en un
archivo sql.
mysqldump -u user -p -d database_name es parecido al comando anterior solo que aquí no se guardan los datos.