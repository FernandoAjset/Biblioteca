SELECT E.FIRST_NAME NOMBRE, E.LAST_NAME APELLIDO, E.SALARY SALARIO, C.COUNTRY_NAME PAIS
FROM EMPLOYEES E, DEPARTMENTS D, LOCATIONS L, COUNTRIES C
WHERE E.SALARY>5000 AND C.COUNTRY_ID='US' OR C.COUNTRY_ID='CA'
AND E.DEPARTMENT_ID=D.DEPARTMENT_ID
AND L.LOCATION_ID=D.LOCATION_ID 
AND C.COUNTRY_ID=L.COUNTRY_ID;
--ORDER BY E.SALARY;


SELECT * FROM COUNTRIES;