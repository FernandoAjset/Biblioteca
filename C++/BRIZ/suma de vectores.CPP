#include<iostream>
#include<conio>

main()
{
int v1[10], v2[10],t[10];

	for(int x=0;x<=9;x++)
	{
 	cout<<"ingrese el valor del v1";
 	cin>>v1[x];
 	cout<<"ingrese el valor del v2";
 	cin>>v2[x];
 	t[x]=v1[x]+v2[x];
	}

cout<<"v1\t"<<"v2\t"<<"total";
cout<<endl;


	for(int x=0;x<=9;x++)
	{
 	cout<<v1[x]<<"\t más \t"<<v2[x]<<"\t es:\t"<<t[x];
   cout<<endl;
	}


getch();
}