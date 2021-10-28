DECLARE
    vNombre varchar2(50);
    vApellido varchar2(50);
BEGIN
    SELECT first_name, last_name INTO vNombre,vApellido
    FROM employees
    WHERE employee_id=100;
    DBMS_OUTPUT.PUT_LINE('Nombre:'||vNombre||', Apellido:'||vApellido);
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('TRANSACCION COMPLETADA');
    EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('ERROR: '||sqlerrm);
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('SE REALIZO ROLLBACK');
END;

DECLARE
vSalario_aumento employees.salary%type := 800;
BEGIN
DBMS_OUTPUT.PUT_LINE('Se aumento: '||vSalario_aumento||' al salario');
UPDATE employees
SET salary=salary+vSalario_aumento
WHERE JOB_ID='ST_CLERK';
END;

DECLARE
vSalario_aumento employees.salary%type:=800;
CURSOR cEmp IS SELECT * FROM employees WHERE job_id='SET_CLERK';
vConteo number;
BEGIN
vConteo:=0;
FOR emp IN cEmp LOOP
IF emp.salary>3000 THEN
dbms_output.put_line(emp.first_name||' gana mas de 3000, su salario es: '||emp.salary);
vConteo:=vConteo + 1;
END IF;
END LOOP;
DBMS_OUTPUT.put_line('HAY '||vConteo||' empleados que ganan mas de 3000');
END;



declare
 vSalario_aumento employees.salary%type := 800;
 cursor cEmp is select * from employees where job_id = 'ST_CLERK';  
 vConteo number; 
begin
 vConteo := 0; 
 For emp in cEmp loop
  if emp.salary > 3000 then 
   dbms_output.put_line(emp.first_name||' gana más de 3000, su sueldo es: '||emp.salary); 
   vConteo := vConteo + 1; 
  end if; 
 End loop; 
 dbms_output.put_line('Hay '||vConteo||' empleados que ganan más de 3000'); 
end;