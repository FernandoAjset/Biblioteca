##NOTA SOBRE ALTERNATIVA DE USO

Es mejor hacer pruebas antes de ejecutar instrucciones que puedan afectar la integridad de nuestra data
Iniciamos una transacción

BEGIN
Ahora supongamos que elimino información de una tabla y se me olvida el WHERE

DELETEFROMauthors;
Rayos ya perdí todo, haa pero como estoy dentro de una transacción debo confirmar las operaciones hechas a la base de datos, de lo contrario no se ejecutarán.

Si confirmo, entonces no hay vuelta atras. Se eliminarían todos los datos de dicha tabla

COMMIT
pero si hago un retroceso de dichos cambios. Entonces es como si nunca hubiese pasado nada.

ROLLBACK
Fiuuu, que alivio.

##ELIMINAR REGISTROS
DELETE FROM authors WHERE author_id=161 LIMIT 1;

#CONSULTA DE 10 TUPLAS RANDOM
SELECT client_id, name, active FROM clients ORDER BY RAND() LIMIT 10;

#ACTUALIZAR REGISTRO, USANDO UPDATE
UPDATE clients
SET active=0
WHERE client_id=93
LIMIT 1
;

#CONSULTA USANDO VARIAS CONDICIONES EN WHERE
SELECT client_id, name, gender, active
FROM clients
WHERE
    client_id IN (1,6,8,27,90)
    OR name like '%Lopez%';

#ACTUALIZAR VARIAS TUPLAS Y VARIAS COLUMNAS USANDO DOS CONDICIONES
UPDATE clients
SET active=1, gender='ND'
WHERE
    client_id IN (1,8,90)
    OR name like '%Lopez%'
;

#CAMBIANDO CAMPO GENDER
ALTER TABLE clients MODIFY gender ENUM('M','F','ND');

#VACIAR TUPLAS USANDO TRUNCATE
TRUNCATE transactions;


