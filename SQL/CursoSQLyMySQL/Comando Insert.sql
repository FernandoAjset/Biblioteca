INSERT INTO authors(author_id,name,nationality)
VALUES(NULL,'Juan Fulfo','MEX');

INSERT INTO authors(name, nationality)
VALUES('Gabriel García Márquez','COL');

INSERT INTO authors
VALUES (NULL,'Juan Gabriel Vasquez','COL');

**VARIAS FILAS A LA VEZ**

INSERT INTO authors(name,nationality)
VALUES ('Julio Cortazar','ARG'),
('Isabel Allende','CHI'),
('Octavio Paz','MEX'),
('Juan Carlos Onetti','URU');


INSERT INTO clients(client_id, name, email, birthdate, gender, active)
VALUES(1,'Maria Dolores Gomez','Maria Dolores.95983222J@random.names','1971-06-06','F',1),
(2,'Adrian Fernandez','Adrian.55818851J@random.names','1970-04-09','M',1),
(3,'Maria Luisa Marin','Maria Luisa.83726282A@random.names','1957-07-30','F',1),
(4,'Pedro Sanchez','Pedro.78522059J@random.names','1992-01-31','M',1);

INSERT INTO clients(name, email, birthdate, gender, active)
VALUES('Pedro Sanchez','Pedro.78522059J@random.names','1992-01-31','M',0)
ON DUPLICATE KEY UPDATE active=VALUES(active)
;

El Laberinto de la Soledad, Octavio Paz, 1952
Vuelta al Laberinto de la Soledadd, Octavio Paz, 1960

SELECT * FROM authors WHERE name='Octavio Paz';

INSERT INTO books(title, author_id)
VALUES('El Laberinto de la soledad',6);

INSERT INTO books(title, author_id, `year`)
VALUES('Vuelta al Laberinto de la Soledad',
(SELECT author_id FROM authors 
WHERE name= 'Octavio Paz'
LIMIT 1),
1960
);


**INSERTAR DESDE ARCHIVO SQL**
- ABRIR LINEA DE COMANDOS SQL
TECLEAR EL COMANDO "SOURCE" =  
source *rutacompleta/usandodiagnoles/normales/con/extension.sql
