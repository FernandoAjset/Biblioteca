nombre="Juan";  //sin poner palabra reservada, es valido pero no es buena practica
let nombre2="Maria";  //usando palabra let reservada
let nombre3; //variable sin asignar valor
const constante=20; //constante, el valor no puede cambiar mas adelante

 console.log(nombre);
 console.log(nombre2);

 //Mejores practicas para declarar nombres de variables
let nombreCompleto="Juan Perez"; //se recomiendo usar CamelCase
console.log(nombreCompleto);

let x, y; //mas de una variable en la misma linea sin asignar valor
x=10, y=20; //asignación posterior
let z=x+y; //suma de las dos variables anteriores
console.log(z);

//Reglas para definir nombres de variables
let nombreCompleto2="Juan Perez";
let nombrecompleto2="Maria Lara";
//se distingue entre mayusculas y minusculas, asi son distintas variables
console.log(nombreCompleto2);
console.log(nombrecompleto2);

//ejemplo de usos correctos de definición de variable, no se puede definir empezando con numero, por ejemplo: "1nombre"
let a1nombre;
let _nombre;
let $nombre;
