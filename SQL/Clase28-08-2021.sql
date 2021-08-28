--funcion round : redondea a la cantidad de decimales que le digamos y aproxima su sintaxis
--   round(columnas,*#decimal)
--funcion trunc: elimina un digito sin aproximar, su sintaxis
--   trunc(columnas,*#decimal)
-- funcion UNION: agrega a una misma consula, elimina repetidos
-- tabla DUAL sirve para hacer pruebas
-- La función NVL en Oracle nos permite obtener un valor concreto en vez de NULL como resultado.
-- podemos concatenar campos usando ||, ejemplo: CAMPO_1 ||' '|| CAMPO_2
SELECT
    sysdate
FROM
    dual; -- sysdate trae la fecha del sistema

SELECT
    e.department_id,
    d.department_name,
    SUM(e.salary)
FROM
    employees   e
    RIGHT JOIN departments d ON e.department_id = d.department_id
GROUP BY
    e.department_id,
    d.department_name
ORDER BY
    3;

SELECT
    c.country_id id_pais,
    c.country_name pais,
    SUM(e.salary)  total
FROM
    employees   e
    LEFT JOIN departments d ON e.department_id = d.department_id
    LEFT JOIN locations   l ON d.location_id = l.location_id
    LEFT JOIN countries   c ON l.country_id = c.country_id
GROUP BY
    c.country_id,
    c.country_name
ORDER BY 3; --Hecha por mi

SELECT
	 nvl(c.COUNTRY_ID,'00') || ' - ' || nvl(c.COUNTRY_NAME,'N/A') Pais
	,sum(e.SALARY) Salario_Ordinario
	,sum(e.SALARY * nvl(e.COMMISSION_PCT,0)) Comision
	,sum(e.SALARY + e.SALARY * nvl(e.COMMISSION_PCT,0)) Salario_Neto 
FROM EMPLOYEES e 
LEFT OUTER JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
LEFT OUTER JOIN LOCATIONS l 
ON d.LOCATION_ID = l.LOCATION_ID 
LEFT OUTER JOIN COUNTRIES c 
ON l.COUNTRY_ID = c.COUNTRY_ID 
GROUP BY nvl(c.COUNTRY_ID,'00') || ' - ' || nvl(c.COUNTRY_NAME,'N/A')
UNION ALL 
SELECT
	 'TOTALES' Pais
	,sum(e.SALARY) Salario_Ordinario
	,sum(e.SALARY * nvl(e.COMMISSION_PCT,0)) Comision
	,sum(e.SALARY + e.SALARY * nvl(e.COMMISSION_PCT,0)) Salario_Neto 
FROM EMPLOYEES e 
LEFT OUTER JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
LEFT OUTER JOIN LOCATIONS l 
ON d.LOCATION_ID = l.LOCATION_ID 
LEFT OUTER JOIN countries c 
ON l.country_id = c.country_id ; -- Hecha por Wilson

--empleado con el salario mas alto
SELECT e.FIRST_NAME || ' ' || e.LAST_NAME Nombres , e.SALARY Salario 
FROM EMPLOYEES e 
WHERE e.SALARY = (SELECT MAX(E2.SALARY) FROM EMPLOYEES e2);
