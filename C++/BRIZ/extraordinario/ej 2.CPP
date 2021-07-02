#include <iostream>
#include <conio>
#include <stdio>
#include <fstream>

int main()
{
float precio, descuento, porcentaje, total;

cout<<"Introduzca el Precio Q: ";
cin>>precio;

cout<<"\nPorcentaje descuento a aplicar: \n";
cin>>porcentaje;

descuento=precio*(porcentaje/100);

total=precio-descuento;

cout<<"\nSubtotal Q";
printf("%.2f", precio);
cout<<"\nDescuento Q";
printf("%.2f", descuento);
cout<<"\nEl costo total es: Q";
printf("%.2f", total);


getch();

}