--a.	(1 punto) Encontrar el nombre, apellido y salario de todos los empleados que ganan menos que el empleado con id 182. 
    SELECT first_name, last_name, salary
    FROM employees
    WHERE salary<(SELECT salary from employees where employee_id=182);
    
    
    select first_name,last_name,salary
    from employees
    order by 3;

--b.	(1 puntos) Realizar una consulta que muestre a todos los empleados. Cada tupla debe mostrar nombre, 
--apellido, departamento, locación id, y ciudad donde labora el empleado. 
    SELECT e.first_name, e.last_name, d.department_name, d.location_id, l.city
    FROM employees e
    LEFT JOIN departments d
    ON e.department_id=d.department_id
    LEFT JOIN locations l
    ON d.location_id=l.location_id
    ;

SELECT * FROM employees;

--c.	(2 puntos) Escribir una consulta la cual muestre a los empleados con sus jefes(managers) 
--Muestre el nombre completo del empleado en una columna, el nombre completo del jefe en otra columna. Incluya los empleados que no tienen jefe.
SELECT e.first_name || e.last_name Empleado, 
FROM employees e
