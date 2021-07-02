#include <iostream>
#include <conio>
#include <stdio>


struct ubicacion
{
 int edificio;
 int nivel;
 int habitacion;
}ubicacion;

struct datos
{
 char nombre[20];
 char nacionalidad[20];
 int edad;
}datos;

struct viaje
{
 char aerolinea[10];
 int vuelo;
 int asiento;
}viaje;

int main()
{

cout<<"datos del viajero\n";

cout<<"Ingrese nombre del viajero\n";
cin>>datos.nombre;
cout<<"nombre de viajero 1: "<<datos.nombre;
getch();
}

