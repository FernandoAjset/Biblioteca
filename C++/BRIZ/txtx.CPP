#include <iostream>
#include <conio>
#include <stdio>
#include <fstream>

int main()
{

int b5,b10,b25,b50,b100,b200,m5,m10,m25,m50,m1,tb,tm,t,peseta,dolar;

cout<<"\n***** SECCION DE BILLETES *****";

cout<<"\nCantidad de billetes de cinco: ";
cin>>b5;

cout<<"\nCantidad de billetes de diez: ";
cin>>b10;

cout<<"\nCantidad de billetes de veinticinco: ";
cin>>b25;

cout<<"\nCantidad de billetes de cincuenta: ";
cin>>b50;

cout<<"\nCantidad de billetes de cien: ";
cin>>b100;

cout<<"\nCantidad de billetes de docientos: ";
cin>>b200;


cout<<"\n***** SECCION DE MONEDAS *****";

cout<<"\nCantidad de monedas de cinco centavos: ";
cin>>m5;

cout<<"\nCantidad de monedas de diez centavos: ";
cin>>m10;

cout<<"\nCantidad de monedas de veinticinco centavos: ";
cin>>m25;

cout<<"\nCantidad de monedas de un quetzal: ";
cin>>m1;

tb=b5+b10+b25+b50+b100+b200;

cout<<"\nLA CANTIDAD DE DINERO QUE HAY EN BILLETES ES: \n",tb);
cout<<"\nLA CANTIDAD DE DINERO QUE HAY EN MONEDAS ES: \n",tm);

t=tb+tm;

cout<<"\t\tMONEDA\t\tCODIGO\n";
cout<<"\t\tPeseta\t\t 1\n";
cout<<"\t\tDolar\t\t 2\n";
cout<<"Introduzca el codigo de la moneda a la que desea convertir los: Q.",t;



 getch();
}
