#include<iostream>
#include<stdio>                                                                                                             #include<stdio>
#include<conio>
#include<fstream>

main()
{
    fstream leer;
    int cont, aux;
    char texto[20];

    leer.open("Log.txt", ios::in);
    while(!leer.eof())
    {
         leer.getline(texto, 20);
         cont++;
    }
    aux=cont-5;
    cont=0;
    leer.close();

    leer.open("Log.txt", ios::in);
    while(!leer.eof())
    {
     		leer.getline(texto, 20);
         cont++;
         if(cont>aux)
         {
         	cout<<texto<<endl;
         }
    }
    leer.close();
    /*leer.seekg(0, ios::end);
    pos=leer.tellg();
    cout<<"Posicion actual "<<pos<<endl;
    cout<<"\IMPRIMIENDO ULTIMOS 5 MOVIMIENTOS..."<<endl;
    for(i=1; i<=5; i++)
    {
    	 leer.seekg(pos-(16*i), ios::beg);  //18 caracteres por linea
       cout<<i<<".- ";
    	 leer.getline(texto,20);
    	 cout<<texto<<endl;
    } */

   getch();
}