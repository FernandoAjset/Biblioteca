#include<iostream>
#include<conio>
#include<stdio>

int main()
{
  int r=0;
  cout<<"***SUMA DE NUMEROS PARES DEL 2 AL 75***\n"<<endl;

  for(int i=2; i<75; i++)
  	{
    if(i%2!=0)
    {
    	r;
    }

    else
    r=r+i;
  	}

	cout<<"\nEL RESULTADO ES: "<<r;

getch();
}