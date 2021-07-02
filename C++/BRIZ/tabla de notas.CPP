                                                                                                                               #include<iostream>
#include<conio>
#include<stdio>

main()
{
int n[2][2];

for(int f=0; f<=1;f++)
{
 for(int c=0;c<=1;c++)
 {
  cout<<"ingrese datos de la posicion:"<<f<<","<<c<<endl;
  cin>>n[f][c];
  }
 }

 cout<<"imprimiendo tabla\n";

 for(int f=0; f<=1;f++)
{
 for(int c=0;c<=1;c++)
 {
  cout<<n[f][c]<<"\t";
 }
  cout<<endl;
 }


  getch();

 }
