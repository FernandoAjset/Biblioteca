#include<iostream>
#include<conio>
#include<stdio>

main()
{
 int a[10], aux, cont;

 for(int x=0;x<=9;x++)
 {
 cout<<"ingrese un numero";
 cin>>a[x];
 }

cout<<"imprimiendo..."<<endl;
for(int x=0;x<=9;x++)
 {
 cout<<a[x]<<endl;
 }

for(int x=0;x<=9;x++)
{
 for(int x=0;x<=9;x++)
 {
  if(a[x]>a[x+1])
  {
 aux=a[x+1];
 a[x+1]=a[x];
 a[x]=aux;
  }
 }
}
cout<<"ordenando..."<<endl;
for(int x=0;x<=9;x++)
 {
 cout<<a[x]<<endl;
 }
 getch();
}