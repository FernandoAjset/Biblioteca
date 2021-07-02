
package proyectofinal;

/**
 *
 * @author balvarado
 */
import arbolBinario .*;
public class ListaEnlazada {
    protected NodoLista inicio; 
       
    public void IngresarFinal(String pDato, String palabras){
        if(inicio == null){
            inicio = new NodoLista(pDato, palabras);             
        }
        else {
            NodoLista nuevo = new NodoLista(pDato, palabras); 
            DarUltimo().SetSig(nuevo);
        }
    }
    
      
    public NodoLista DarUltimo(){
        NodoLista aux = inicio; 
        while(aux.DarSig()!= null){
            aux = aux.DarSig(); 
        }
        return aux; 
    }
  
        public String Recorrer(String pDato){
            String respuesta = new String();
        NodoLista aux = inicio; 
        while(aux!=null){
            if(aux.palabras.Buscar(pDato)!=false){
                respuesta+=aux.DarDato()+" ";
            }
            aux = aux.DarSig();             
        }
        return respuesta;
    }
//    public void Recorrer(){
//        NodoLista aux = inicio; 
//        while(aux!=null){
//            System.out.println(aux.DarDato());
//            aux.palabras.Preorden();
//            System.out.println("\n");
//            aux = aux.DarSig();             
//        }
//    }    
    
    public NodoLista EliminarInicio(){
        NodoLista aux = inicio; 
        inicio = aux.DarSig(); 
        return aux; 
    }
     
        public NodoLista SiExiste(String pdato) {
        NodoLista Respuesta=null;
        NodoLista aux = inicio;
        while (aux != null) {
            if (pdato.equalsIgnoreCase(aux.DarDato())==true) {
                Respuesta=aux;
            }
            aux= aux.DarSig();
        }
        return Respuesta;
        }
    
    public static void main(String args[]){
        ListaEnlazada l1 = new ListaEnlazada(); 
        Arbol palabras = new Arbol();   
        
        l1.IngresarFinal("Alumnos", "Karla,MArio");
        System.out.println(l1.SiExiste("alumnos").DarDato());
    }   

}
