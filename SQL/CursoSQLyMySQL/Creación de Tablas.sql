CREATE TABLE IF NOT EXISTS books(
    book_id INTEGER UNSIGNED PRIMARY KEY auto_increment,
    author_id INTEGER UNSIGNED,
    title varchar(100) NOT NULL,
    `year` integer unsigned not null default 1900,
    `language` varchar(2) not null default 'es' comment 'ISO 639-1 Language',
    cover_url varchar(500),
    price double(6,2) not null default 10.0,
    sellable tinyint(1) default 1,
    copies integer 
    not null default 1,
    `description` text 
);

CREATE TABLE IF NOT EXISTS authors(
    author_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100) NOT NULL,
    nationality VARCHAR(3)
);

CREATE TABLE clients (
client_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL UNIQUE,
birthdate DATETIME,
gender ENUM('M','F','ND') NOT NULL,
active TINYINT(1) NOT NULL DEFAULT 1,
created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP 
    ON UPDATE CURRENT_TIMESTAMP  
);
#-que libro,
#que cliente lo lleva,


CREATE TABLE IF NOT EXISTS operations(
operations_id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
book_id INTEGER UNSIGNED NOT NULL,
client_id INTEGER UNSIGNED NOT NULL,
`type` ENUM('prestado','devuelto','vendido'),
created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
finshed TINYINT(1) NOT NULL DEFAULT 0
);

