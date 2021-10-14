let a=3;
let b=2;
z=a+b; //suma
console.log("Resultado de la suma: "+z);

z=a-b;
console.log("Resultado de la resta: "+z);

z=a*b;
console.log("Resultado de la multiplicación: "+z);

z=a/b;
console.log("Resultado de la división: "+z);

z=a%b;
console.log("Resultado del modulo es: "+z);

z=a**b;
console.log("Resultado de "+a+" elevado "+b+" es: "+z);

//Incremento
//Pre-Incremento (el operador ++ antes de la variable)
z=++a;  //primero se incrementa "a" y luego se asigna a "z"
console.log("Valor con pre-incremento: "+z);
//Post-Incremento (el operador ++ despues de la variable)
z=b++;  //primero se asigna el valor de "b" a "z" y despues se incrementa "b"
console.log("Valor con post-incremento: "+z);


//Decremento
//Pre-Decremento
z=--a;
console.log("Valor con pre-decremento: "+z);
//Post-Drecemento
z=a--;
console.log("Valor con post-decremento: "+z);
console.log("Valor de a post-decremento: "+a);