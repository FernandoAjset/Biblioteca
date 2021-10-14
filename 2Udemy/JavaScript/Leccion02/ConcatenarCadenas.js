var nombre = "Juan";
var apellido = "Perez";
var nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);

var x = nombre + 2 + 2 + 4; //todo lo trata como cadena por el nombre que primero hay una cadena
console.log(x);

x = nombre + (2 + 4); //lo que está en parentesis, lo toma de prioridad y lo suma, luego ese resultado lo concatena a nombre
console.log(x);

var y = 5 + 4 + 2; //todos los trata como numeros
console.log(y);