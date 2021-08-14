#COMANDO ALTER CREANDO COLUMNA birthyear
ALTER TABLE authors ADD COLUMN birthyear INTEGER 
DEFAULT 1930
AFTER name;

#MODIFICAR CAMPO QUE CREAMOS ARRIBA
ALTER TABLE authors MODIFY COLUMN birthyear YEAR DEFAULT 1920;

#BORRAR UNA COLUMNA DE LA TABLA
ALTER TABLE authors DROP COLUMN birthyear;

###HACER BACKUP DE LA BASE DE DATOS
#SE PUEDE HACER TRAER ESQUEMA Y DATOS, O SOLO ESQUEMA

#CREACION DE ESQUEMA Y TODOS LOS REGISTROS
#Abrir CMD, usando "cd" ir a la ruta del bin, predeterminado es: C:\Program Files\MySQL\MySQL Server 8.0\bin 
#Ingresar comando:
mysql -u root -p *nombreBD

#BACKUP SOLO DEL ESQUEMA, SIN LOS REGISTROS
mysqldump -u root -p -d pruebaplatzi | more

#Para windows 10 se debe asignar la ruta donde se desea guardar
#C:\Program Files\MySQL\MySQL Server 5.7\bin>mysqldump -u root -p -d pruebaplatzi > "D:\Jaime Uribe\Descargas\esquema.sql"

#PEDIRA PASS, INGRESAR Y ENTER
#MOSTRARA TODO EL CODIGO

#PARA GUARDAR TODO EN SCRIPT
mysql -u root -p *nombreBD > *nombreScript.sql
#EL SCRIPT SE GUARDARÁ EN LA RUTA \bin por defecto




