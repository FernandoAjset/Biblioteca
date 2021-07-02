#include<iostream>
#include<conio>
#include<stdio>

main()
{
 int pp[2],sp[2],zona[2],ef[2],t[2];

 for(int n=0;n<=1;n++)
 {
  cout<<"ingrese nota para pp: ";
  cin>>pp[n];
  cout<<"ingrese notas para sp: ";
  cin>>sp[n];
  cout<<"ingrese notas para zona: ";
  cin>>zona[n];
  cout<<"ingree notas para ef: ";
  cin>>ef[n];

  t[n]=pp[n]+sp[n]+zona[n]+ef[n];

  }

cout<<"pp\t"<<"sp\t"<<"zona\t"<<"ef\t"<<"t\t"<<"RESULTADO";
cout<<endl;
for(int n=0;n<=1;n++)
{
   cout<<pp[n]<<"\t"<<sp[n]<<"\t"<<zona[n]<<"\t"<<ef[n]<<"\t"<<t[n]<<"\t";

if(t[n]>=61)

{
 cout<<"APROBADO";
}
else
{
 cout<<"REPROBADO";
}
cout<<endl;
}
getch();
}

