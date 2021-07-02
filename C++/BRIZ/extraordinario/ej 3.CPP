#include <iostream >
#include <stdio>
#include <conio.h>

main()
{
 char E[6][20];
 float N1[6], N2[6], N3[6],N4[6],N5[6];
 int PR[6];

 for(int x=1; x<6; x++)
 {
 cout << "INGRESE EL NOMBRE PARA ESTUDIANTE " << x <<" : ";
 cin>>E[x];

 cout << "INGRESE LA PRIMERA NOTA: ";
 cin >> N1[x];
 cout << "INGRESE LA SEGUNDA NOTA: ";
 cin >> N2[x];
 cout << "INGRESE LA TERCERA NOTA: ";
 cin >> N3[x];
 cout << "INGRESE LA CUARTA NOTA: ";
 cin >> N4[x];
 cout << "INGRESE LA QUINTA NOTA: ";
 cin >> N5[x];
 cout<<endl<<endl;

 PR[x]=(N1[x]+N2[x]+N3[x]+N4[x]+N5[x])/5;
 }

	cout << "PROMEDIOS OBTENIDOS:" << endl;
   cout << "ESTUDIANTE\t"<<"N1\t"<<"N2\t"<<"N3\t"<<"N4\t"<<"N5\t"<<"PROMEDIO\t";

 for(int x=1; x<6; x++)
 {
 cout<<endl;
 cout << E[x] << "\t" << "\t" << N1[x] << "\t" << N2[x] << "\t" << N3[x] << "\t" << N4[x] << "\t" << N5[x] << "\t" << PR[x];
 }

  getch();
 }
