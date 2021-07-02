#include <iostream>
#include <stdio>
#include <conio>
#include <string>
#include <fstream>

main ()
{
  fstream leer;
  fstream esc;
  char log[50][20];
  char texto[20];
  int num, pos, i, cont=0;

/*
//CREACION DEL FICHERO
  esc.open("log.txt", ios::out);
  for(int x=0; x<=2; x++)
  {
      cout<<"Ingrese registro "<<x<<" ";cin>>texto;
      cont++;
      esc<<cont<<" Linea "<<texto<<endl;
  }
  esc.close();

  cout<<"\nContador "<<cont<<endl;
*/

//ACCESO AL FICHERO
  leer.open("log.txt", ios::in | ios::binary);
  //posicionarse al final del archivo
  leer.seekg(0, ios::end);
  //Posicion es igual a el final del archivo
  pos=leer.tellg();
  cout<<"\Posicion actual "<<pos<<endl;

  for(i=(pos-(16*5), i, i-16)
  {
  		leer.seekg(pos-16, ios::beg);   	//la posicion actual total caracteres
      leer.getline(texto,20);          //menos 16 caracteres por linea
      cout<<texto<<endl;
   }


  leer.close();
  getch();
}