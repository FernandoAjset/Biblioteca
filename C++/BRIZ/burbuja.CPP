 #include <iostream>
 #include <conio>
 #include <stdio>

 main()
 {
  	int v[5],aux;


   for(int x=0;x<=4;x++)
   {
   cout<<"ingrese los numeros";
   cin>>v[x];

   if(v[x]>v[x+1])
  	 	{
       aux=v[x];
   	 v[x]=v[x+1];
       v[x+1]=aux;
   	}
   }

  for (int x=0;x<=4;x++)
  {
   cout<<v[x]<<endl;
  }



 getch();
 }
