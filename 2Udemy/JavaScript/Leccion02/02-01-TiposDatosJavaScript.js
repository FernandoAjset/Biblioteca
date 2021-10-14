//tipo de dato String
var nombre = "carlos";
console.log(nombre);

//Tipo de dato numerico
var numero = 1000;
console.log(numero);

//Tipo Object
var objeto = {
    nombre: "Juan",
    apellido: "Perez",
    telefono: 47854411,
};
console.log(objeto);

//Tipo de dato boolean
var bandera = true;
console.log(bandera);

//Tipo de dato function
function miFuncion() { }

console.log(miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Clases en JavaScript, tambien son function
class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);

//Tipo de dato undefined
var x;
console.log(typeof X);
x = undefined;
console.log(x);

//palabra null
var y = null;
console.log(y);

//arreglos
var autos = ["BMW", "Audi", "Volvo"];
console.log(autos);
console.log(typeof autos);

//Variables vacias en su asignación
var z="";
console.log(z);
console.log(typeof z);