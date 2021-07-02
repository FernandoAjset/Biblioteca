#include<iostream>
#include<stdio>
#include<conio>

main (){
   float a, b, c, d, resultado=0;

   cout<<"Digite el valor de a: ";cin>>a;
   cout<<"Digite el valor de b: ";cin>>b;
   cout<<"Digite el valor de c: ";cin>>c;
   cout<<"Digite el valor de d: ";cin>>d;

   resultado=(a+b)/(c+d);

   cout.precision(2);
   cout<<"\nEl resultado es: "<<resultado;

	getch();
}