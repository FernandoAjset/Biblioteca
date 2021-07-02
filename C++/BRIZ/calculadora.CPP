# include <iostream.h>
# include <conio.h>
# include <stdio.h>

main(){

int n1,n2,op;

	cout<<"OPERACIONES \n";
   cout<<"1) Suma \n"<<"2) Resta \n"<<"3) Multiplicacion \n"<<"4) Division \n"<<endl;
	cout<<"Indique el numero de la accion que quiere realizar: \n";
	cin>>op;
   		switch(op)
         {
         case 1: {cout<<"Ingrese el primer numero: \n";
         			cin>>n1;
                  cout<<"Ingrese el segundo numero: \n";
                  cin>>n2;
         			cout<<"Se realizo una suma, La SUMA es: "<<(n1+n2)<<endl;
                  }
         break;
         case 2: {cout<<"Ingrese el primer numero: \n";
         			cin>>n1;
                  cout<<"Ingrese el segundo numero: \n";
                  cin>>n2;
         			cout<<"Se realizo una RESTA, El residuo es: "<<(n1-n2)<<endl;
                  }
         break;
         case 3: {cout<<"Ingrese el primer numero: \n";
         			cin>>n1;
                  cout<<"Ingrese el segundo numero: \n";
                  cin>>n2;
         			cout<<"Se realizo una MULTIPLICACION, El resultado es: "<<(n1*n2)<<endl;
                  }
         break;
         case 4: {cout<<"Ingrese el primer numero: \n";
         			cin>>n1;
                  cout<<"Ingrese el segundo numero: \n";
                  cin>>n2;
         			cout<<"Se realizo una DIVISION, el resultado es: "<<(n1/n2)<<endl;
                  }
         break;
         default: cout<<"El numero de operacion seleccionado es incorrecto";
         }

getch();
}