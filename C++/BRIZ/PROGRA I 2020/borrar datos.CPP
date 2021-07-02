#include<stdio>
#include<iostream>
#include<conio>


struct Nodo{
   int dato;
   Nodo *siguiente;

};



void insertar(Nodo *&lista, int n){
     Nodo *nuevo_nodo = new Nodo();
     Nodo *aux;

     nuevo_nodo->dato = n;
     nuevo_nodo->siguiente = NULL;

     if(lista == NULL)
     {
        lista = nuevo_nodo;
     }
     else{
          aux=lista;
          while(aux->siguiente != NULL){
          aux=aux->siguiente;
          }
          aux->siguiente = nuevo_nodo;
     }
}

void imprimir(Nodo *lista){
	  while(lista!= NULL){
      	cout<<lista->dato<<endl;
         lista = lista->siguiente;
     }
}


void eliminar_numero(Nodo *&lista, int n ){
     if(lista !=NULL){

     Nodo *eliminar;
     Nodo *aux=NULL;
     eliminar=lista;


     		while((eliminar!=NULL)&& (eliminar->dato!=n)){
         	aux=eliminar;
     			eliminar=eliminar->siguiente;
         }
         if(eliminar==NULL){
         	cout<<"NO ES POSIBLE ELIMINAR EL DATO INDICADO\n";
         }

         else if(aux==NULL){
           lista=lista->siguiente;
           delete eliminar;
         }

     		else{
         aux->siguiente=eliminar->siguiente;
     		delete eliminar;
     }

}
}

int main(){
    Nodo *lista = NULL;

    int date, n;

        cout<<"******INGRESE LOS DATOS DE LA LISTA*******"<<endl;


    for(int x=0; x<5; x++)
    {
       cout<<"ingrese un numero: ";
       cin>>date;
       insertar(lista, date);

     }
    cout<<"\nINDIQUE EL NUMERO QUE DESEA ELIMINAR: ";cin>>n;
    eliminar_numero(lista,n);

    cout<<"\nMOSTRANDO DATOS INGRESADOS A LA LISTA"<<endl;
    imprimir(lista);

	getch();
}



