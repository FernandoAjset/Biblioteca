#include <iostream>
#include <conio>
#include <stdio>
#include <fstream>
#include <string>

main()
{

char linea[300];
string documento="fichero.txt";
int cont;

ifstream leer;


do
	{
	cout<<"Ingrese el nombre del documento que desea leer\n";
	cin>>documento;
   documento+=".txt";
	leer.open(documento.c_str(), ios::in);
   if(leer.fail())
   cout<<"ERROR!!... ingrese correctamente el nombre del archivo\n\n";
   }
 while (leer.fail());
  leer.close();
 cout<<"\nImprimiendo lineas de texto\n\n";

 leer.open(documento.c_str(), ios::in);
 while(!leer.eof())
      {
       leer.getline(linea,100);
       cout<<linea;
       cont++;
       if(cont%30==0)
       {
        cout<<"\n\nPresione Enter para continuar...\n";
        cin.get();
       }
      }


getch();

}


