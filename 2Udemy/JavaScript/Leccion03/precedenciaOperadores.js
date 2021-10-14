let a=3, b=2, c="3", d=4;

let z= a*b+c/d; //las operaciones se evaluan de izquierda a derecha
console.log(z);

z= c+a*b/d; //se evalua de izquierda a derecha, pero la multiplicación tiene mayor prioridad
console.log(z);

/*los parentesis son los de mayor prioridad, le sigue los corchetes.
los operadores de mult, div, mod.. son mayor prioridad a los de suma y resta*/

//OPERADORES DE ASIGNACIÓN
let m =1;

//operador de asignación compuesto
m +=3; // a = a + 3
console.log(m);

m -=2; // a = a - 2
console.log(m);
/* mas operadores de asignación
    *=
    /=
    %=
    **=
*/

//OPERADORES DE COMPARACIÓN
z=a==b; //se revisa el valor sin importar el tipo.
console.log(z);

z = a === c; //revisa si los valores son iguales y ademas los tipos.

console.log(z); //el resultado es negativo, porque evalua el valor y el tipo de dato
z=a==c;
console.log(z); //el resultado es positivo, porque no compara tipo de dato


