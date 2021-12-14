package arbol;


public class ArbolBinario {
    public NodoArbol raiz;
    public String cadena = new String();
    int altura;
    int cant;
    int suma;
    int aux;

    
  public ArbolBinario(){

    raiz = null; 

  }

  public ArbolBinario(NodoArbol raiz){

    this.raiz = raiz; 

  }

  public NodoArbol DarRaiz(){

    return raiz; 

  }

  boolean EstaVacio(){

    return raiz == null; 

  }
//METODO INGRESAR LIBRO
   public void IngresarLibro(String dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(NodoArbol padre, String dato) {
        if (dato.compareTo(padre.DarDato()) > 0) {
            if (padre.DarDer() == null) {
                padre.SetDer(new NodoArbol(dato));
            } else {
                this.insertar(padre.DarDer(), dato);
            }
        } else {
            if (padre.DarIzq() == null) {
                padre.SetIzq(new NodoArbol(dato));
            } else {
                this.insertar(padre.DarIzq(), dato);
            }
        }
    } 
  
//METODO PARA BUSCAR ITERADO
  public boolean BuscarLibro(String pDato){
    boolean existe = false; 

    NodoArbol aux = raiz; 

    while(!existe && aux!=null){

      if(aux.DarDato().equalsIgnoreCase(pDato))

        existe = true; 

      else if (pDato.equals(aux.DarDato()))

        aux=aux.DarIzq();

      else

        aux = aux.DarDer();         

    }     

    return existe; 

  }

//METODO ALTURA
private void retornarAltura (NodoArbol reco,int nivel)    {
        if (reco != null) {    
            retornarAltura (reco.DarIzq(),nivel+1);
            if (nivel>altura)
                altura=nivel;
            retornarAltura (reco.DarDer(),nivel+1);
        }
    }

    public  int retornarAltura () {
        altura=0;
        retornarAltura (raiz,1);
        return altura;
    }
    
//CANTIDAD DE NODOS
 void cantidad(NodoArbol reco) {
    
        if (reco!=null) {
            cant++;
            cantidad(reco.izq);
            cantidad(reco.Der);
        }
    }  

public int cantidad() {
        cant=0;
        cantidad(raiz);
        return cant;
    }


//RECORRER EN ORDEN
public void inorden(NodoArbol nodo){
       if (nodo.DarIzq() !=null){
           inorden(nodo.DarIzq());
       }
       System.out.println(nodo.DarDato());
       if(nodo.DarDer() !=null){
           inorden(nodo.DarDer());
       }
   }
   
//RECORRER POSORDEN
   public void postorden(NodoArbol nodo){
       if(nodo.DarIzq() !=null){
           postorden(nodo.DarIzq());
       }
       if(nodo.DarDer() !=null){
           postorden(nodo.DarDer());
       }
       System.out.println(nodo.DarDato());
   }

 public String Preorden(){
    cadena="";
    String resultado = preorden(raiz); 
    return resultado;
  }

   

  public String preorden(NodoArbol r){

    if (r!=null){

      cadena+=r.DarDato()+ ",";

      preorden(r.DarIzq()); 

      preorden(r.DarDer()); 
    }

    return cadena;
  }
}
