use prueba;
-- empezando de nuevo la tarea

select *from alumno;
select *from curso;
select *from asignacion;

insert into alumno
(
	idAlumno,
	nombreAlumno,
    carreraAlumno		
)
 values
	(1,'Juan','Derecho'),
	(2,'Karla','Administracion'),
	(3,'Marta','Industrial')
;

insert into curso
(
	idCurso,
    nombreCurso,
    profesor
)
values
	(1,'Matematicas','David'),
	(2,'Automatas','Mario'),
	(3,'Leyes','Lucrecia'),
    (4,'Filosofia','Marcos'),
    (5,'Mercados','Viviana')
;

 insert into asignacion
 (
	idForm,
    idAlumno,
    idCurso
)
values
	(1,'1','2'),
    (2,'1','3'),
    (3,'2','5'),
    (4,'2','2'),
    (5,'2','4'),
    (6,'2','3'),
    (7,'3','1'),
    (8,'3','2')
;    
-- union
select idCurso, nombreCurso from curso
union 
select idAlumno, nombreAlumno from alumno;

select 
	a.idAlumno, 
	a.nombre,
    b.nombreCurso
from alumno a
full outer join curso b
on a.idAlumno=b.idCurso; 

-- interseccion que muestra los cursos asignados a un alumno     
select
    a.idAlumno,
    a.nombreAlumno,
    b.idCurso,
    c.nombreCurso
from alumno a
inner join asignacion b inner join curso c 
on a.idAlumno=b.idAlumno && b.idCurso=c.idCurso;    

-- complemento debo traer solo las que no estan en conjunto a

select *from alumno;
select *from curso;
select *from asignacion;
insert into alumno
(
	idAlumno,
	nombreAlumno,
    carreraAlumno		
)
 values
	(4,'Pedro','Medicina'),
	(5,'Yoselin','Derecho'),
	(6,'Jesus','Psicologia')
;

-- el conjunto alumno puede estar conformado de alumnos que no tengan asignacion, de este modo
-- el resultado en la consulta de abajo sera el complemento del conjunto asignacion
select 
	a.idAlumno,
    a.nombreAlumno
from alumno a
left join asignacion b
on a.idAlumno=b.idAlumno
where b.idAlumno is null;




