SELECT e.first_name, d.department_name
FROM employees e, departments d
WHERE e.department_id=d.department_id;

SELECT e.first_name, d.department_name
FROM employees e LEFT JOIN departments d
ON e.department_id=d.department_id;

SELECT e.first_name, d.department_name
FROM employees e RIGHT JOIN departments d
ON e.department_id=d.department_id;

SELECT e.first_name, d.department_name
FROM employees e FULL JOIN departments d
ON e.department_id=d.department_id;

SELECT * FROM employees;


--FUNCION NVL:
--NVL(COLUMNA,VALOR)
SELECT first_name, salary, (salary * NVL(commission_pct,0)) comision,(salary+salary*NVL(commission_pct,0)) salario_final FROM employees;
