#include<iostream>
#include<conio>
#include<fstream>
int main()
{
 ofstream archivo; //objeto de la clase ofstream

 archivo.open("archivo.txt");

 archivo<<"hola"<<endl;
 archivo<<"escribiendo"<<endl;
 archivo<<"guardando..."<<endl;

 archivo.close();

 getch();
}