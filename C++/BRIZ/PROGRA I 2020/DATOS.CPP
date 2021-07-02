#include<conio>
#include<fstream>
#include<stdio>
#include<iostream>


main()
{
ofstream txt;
char name[20], d[50];
int edad[20];

cout<<"Por favor ingrese el nombre: \n";
cin>>name;

cout<<"Por favor ingrese la edad: \n";
cin>>edad;

cout<<"Por favor ingrese la dirección de residencia: \n";
cin>>name;

txt.open("gente.txt", ios::app);
cout<<endl;
txt<<" Se guardaron los siguientes datos:   "<<name, edad, d;
txt.close();



getch();
}
