#include<iostream>
#include<conio>
#include<stdio>
#include<fstream>

//AREA DE FUNCIONES/PROCEDIMIENTOS

//Procedimiento de Menu principal
void menu()
{
         cout<<"\nCAJERO AUTOMATICO"<<endl;
 			cout<<"1. Mostrar Saldo"<<endl;
         cout<<"2. Realizar Retiro"<<endl;
         cout<<"3. Realizar Deposito"<<endl;
         cout<<"4. Mostrar los ultimos 5 movimientos"<<endl;
         cout<<"5. Salir"<<endl;
}

//1. Procedimiento Mostrar saldo
void saldos()
{        ifstream leer;
			int saldo;

         leer.open("Saldo.txt", ios::in);
         leer>>saldo;
         leer.close();
         cout<<"\nSALDO ACTUAL DISPONIBLE: Q"<<saldo<<endl;

}

//2. Procedimiento Retiros
void retirar(int act, int ret)
{
			int saldo;
         ifstream leer;
         ofstream esc;
         int val;

         cout<<"\nRETIROS A CUENTA";
         do
         {
         	cout<<"\nIngrese la cantidad que desea retirar: Q";cin>>ret;
            if(ret%100==0)
            {
            	val=1;
            }
            else
            {
            	val=0;
            }

            if((val!=1)||(ret==0))
            {
            	cout<<"\nCANTIDAD NO VALIDA, SOLO PUEDE RETIRAR CANTIDADES MULTIPLO DE 100";
            }

            if(ret<0)
         	{
            	cout<<"\nCANTIDAD NO VALIDA, EL RETIRO NO PUEDE SER NEGATIVO";
         	}

         }while((val!=1)||(ret==0)||(ret<0));

         leer.open("Saldo.txt", ios::in);
         leer>>saldo;

         if(saldo>=ret)
         {
         	act=saldo-ret;
            leer.close();

            esc.open("Log.txt", ios::app);
            esc<<"Retiro:   Q"<<ret<<endl;
            esc.close();
            esc.open("Saldo.txt", ios::trunc);
            esc<<act;
            esc.close();

            cout<<"\nRETIRO REALIZADO CON EXITO\n";
         }
         else
         {
            cout<<"\nNO SE PUEDE RETIRAR PORQUE EL SALDO ES INSUFICIENTE\n";
			}
}

//3. Procedimiento Deposito
void depositar(int act, int dep)
{
              int saldo;
              ifstream leer;
              ofstream esc;
              int val;

				  cout<<"\nDEPOSITOS A CUENTA";
              do
              {
	           		cout<<"\nIngrese la cantidad que desea depositar: Q";cin>>dep;
      				if(dep%100==0)
              		{
                     val=1;
              		}
                  else
                  {
                      val=0;
                  }

                  if((val!=1)||(dep==0))
              		{
                     cout<<"\nCANTIDAD NO VALIDA, SOLO PUEDE DEPOSITAR CANTIDADES MULTIPLO DE 100";
                 	}

                  if(dep<0)
              		{
                     cout<<"\nCANTIDAD NO VALIDA, EL DEPOSITO NO PUEDE SER NEGATIVO";
                 	}

              }while((val!=1)||(dep==0)||(dep<0));

              leer.open("Saldo.txt", ios::in);
              leer>>saldo;
              act=saldo+dep;
              leer.close();

              esc.open("Log.txt", ios::app);
              esc<<"Deposito: Q"<<dep<<endl;
              esc.close();
              esc.open("Saldo.txt", ios::trunc);
              esc<<act;
              esc.close();

              cout<<"\nDEPOSITO REALIZADO CON EXITO\n";
}

//4. Procedimiento Mostrar ultimos movimientos
void movimientos()
{
    fstream leer;
    int cont=0, aux;
    char texto[20];

    leer.open("Log.txt", ios::in);
    if(leer.fail())
    {
       cout<<"NO EXISTEN MOVIMIENTOS PARA MOSTRAR...\n"<<endl;
    }
    else
    {
    	cout<<"\nIMPRIMIENTO LOS ULTIMOS MOVIMIENTOS..."<<endl;
    	while(!leer.eof())
    	{
         leer.getline(texto, 20);
         cont++;
    	}
      aux=cont-5;  //auxiliar es la cantidad de lineas que debe omitir cont-5
    	cont=0;
    	leer.close();

    	leer.open("Log.txt", ios::in);
    	while(!leer.eof())
    	{
     		leer.getline(texto, 20);
         cont++;
         if(cont>=aux) //hasta que contador sea mayor a las lineas a omitir, imprime las lineas
         {
         	cout<<texto<<endl;
         }
    	}
    	leer.close();
    	}
}

/*/INICIO DEL MAIN
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
*/
main (){

         ofstream saldo_in;		//Servira para crear el block de notas con el saldo inicial
         int pin_def=0123; 		//Constante del pin por defecto
			int pin, saldo_act, retiro, deposito, op;

         saldo_in.open("Saldo.txt", ios::noreplace);
         saldo_in<<"500"<<endl;
         saldo_in.close();

pin:     cout<<"BIENVENIDO!!\n";
         //bucle para autenticar pin
			do{
				cout<<"Ingrese Pin: ";cin>>pin;
            if(pin!=pin_def)
            {
               cout<<"PIN INCORRECTO, INTENTE NUEVAMENTE..."<<endl;
            }
         	}while(pin!=pin_def);

         //llama a funcion menu principal
inicio:  menu();cout<<endl;
			cout<<"Ingrese la operacion que desea realizar: ";cin>>op;

         switch(op)
         {
               case 1: saldos();
                       do
                       {
                          cout<<"Presione 1 para realizar otra operacion, Presiene 0 para salir: ";cin>>op;
                       }  while((op!=1)&&(op!=0));

                       if(op==1)
                       {
                          goto inicio;
                       }
                       if(op==0)
                       {
                          cout<<"Saliendo del programa...";
                          cout<<"\nPROGRAMA FINALIZADO";
                       }
               break;

               case 2: retirar(saldo_act,retiro);
                       do
                       {
                          cout<<"Presione 1 para realizar otra operacion, Presiene 0 para salir: ";cin>>op;
                       }  while((op!=1)&&(op!=0));

                       if(op==1)
                       {
                          goto inicio;
                       }
                       if(op==0)
                       {
                          cout<<"Saliendo del programa...";
                          cout<<"\nPROGRAMA FINALIZADO";
                       }
               break;

          		case 3: depositar(saldo_act,deposito);
                       do
                       {
                          cout<<"Presione 1 para realizar otra operacion, Presiene 0 para salir: ";cin>>op;
                       }  while((op!=1)&&(op!=0));

                       if(op==1)
                       {
                          goto inicio;
                       }
                       if(op==0)
                       {
                          cout<<"Saliendo del programa...";
                          cout<<"\nPROGRAMA FINALIZADO";
                       }
               break;

               case 4: movimientos();
               		  do
                       {
                          cout<<"Presione 1 para realizar otra operacion, Presiene 0 para salir: ";cin>>op;
                       }  while((op!=1)&&(op!=0));

                       if(op==1)
                       {
                          goto inicio;
                       }
                       if(op==0)
                       {
                          cout<<"Saliendo del programa...";
                          cout<<"\nPROGRAMA FINALIZADO";
                       }
               break;

               case 5:
                        cout<<endl;
								goto pin;
               break;

               default: cout<<"OPCION INVALIDA, SELECCIONE UNA OPCION CORRECTA"<<endl<<endl;
                        goto inicio;

         }

        	getch();
}