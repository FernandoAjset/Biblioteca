#include <iostream>
#include <conio>
#include <stdio>

 void TablaMultiplicar()
 #include<stdio>
#include<conio>
{
		int tabla;

      cout<<"Ingrese numero de tabla:"<<endl;
      cin>>tabla;

      for (tabla=1; tabla<=12; tabla++)
      {
         cout<<"Tabla del: "<<tabla<<endl;
			for(int x=1; x<=10; x++)
      	{
         int resultado= tabla*x;
			cout<<tabla<<" x "<<x<<" = "<<resultado<<endl;
         }
      }



main()
{

TablaMultiplicar;

 getch();
}





