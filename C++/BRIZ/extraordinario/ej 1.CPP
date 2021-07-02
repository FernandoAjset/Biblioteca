#include <iostream>
#include <conio>
#include <stdio>
#include <fstream>

void menu()
{
cout<<"\nMONEDA\t\tCODIGO\n";
cout<<"lempira\t\t 1\n";
cout<<"quetzales\t 2\n";
cout<<"euros\t\t 3\n";
cout<<"salir\t\t 4\n";

cout<<"Introduzca el codigo de la moneda a la que desea convertir:";
}

int main()
{

int b5,b10,b20,b50,b100,b200,m5,m10,m25,m50,m1;
float bi[6]={5,10,20,50,100,200},tb=0,tm=0,t;
float mo[5]={0.05,0.10,0.25,0.50,1.00};

cout<<"\n***** SECCION DE BILLETES *****";

cout<<"\nCantidad de billetes de cinco: ";
cin>>b5;
tb=tb+b5*bi[0];


cout<<"\nCantidad de billetes de diez: ";
cin>>b10;
tb=tb+b10*bi[1];

cout<<"\nCantidad de billetes de veinte: ";
cin>>b20;
tb=tb+b20*bi[2];

cout<<"\nCantidad de billetes de cincuenta: ";
cin>>b50;
tb=tb+b50*bi[3];

cout<<"\nCantidad de billetes de cien: ";
cin>>b100;
tb=tb+b100*bi[4];

cout<<"\nCantidad de billetes de docientos: ";
cin>>b200;
tb=tb+b200*bi[5];


cout<<"\n***** SECCION DE MONEDAS *****";

cout<<"\n\nCantidad de monedas de cinco centavos: ";
cin>>m5;
tm=tm+m5*mo[0];


cout<<"\nCantidad de monedas de diez centavos: ";
cin>>m10;
tm=tm+m10*mo[1];

cout<<"\nCantidad de monedas de veinticinco centavos: ";
cin>>m25;
tm=tm+m25*mo[2];

cout<<"\nCantidad de monedas de cincuenta centavos: ";
cin>>m50;
tm=tm+m50*mo[3];

cout<<"\nCantidad de monedas de uno: ";
cin>>m1;
tm=tm+m1*mo[4];

cout<<"\nLA CANTIDAD DE DINERO QUE HAY EN BILLETES ES: \n"<<tb;
cout<<"\nLA CANTIDAD DE DINERO QUE HAY EN MONEDAS ES: \n"<<tm;

t=tb+tm;

cout<<"\nLA CANTIDAD DE DINERO EN TOTAL ES: \n"<<t<<endl;

cout<<"\n****CONVERSION DE DIVISAS****\n";

menu();

float conv;
int cambio;
cout<<"Introduzca el codigo de la moneda a la que desea convertir:";
cin>>cambio;


switch (cambio)
  {
	case 1: conv=t*24.93;
   break;

   case 2: conv=t*7.71;
   break;

   case 3: conv=t*0.92;
   break;

   default: cout<<"\nOpcion invalida";

  }

cout<<"\nMONTO CONVERTIDO: "; printf("%.2f", conv);
cout<<"\nFINALIZANDO EL PROGRAMA.......";
 getch();
}
