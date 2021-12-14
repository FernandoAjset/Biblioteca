package arbol;


/**
 *
 * @author 187506-EDGARFERNANDO
 */
public class NodoArbol {

    String dato;
    protected NodoArbol raiz;
    protected NodoArbol izq;
    protected NodoArbol Der;
    protected NodoArbol sig;

   public NodoArbol(String pDato){

     dato = pDato;   

   }   
   
   public String DarDato(){

     return dato;

   }   

    public void SetDato(String dato) {
        this.dato = dato;
    }

    public NodoArbol DarRaiz() {
        return raiz;
    }

    public void SetRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol DarIzq() {
        return izq;
    }

    public void SetIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol DarDer() {
        return Der;
    }

    public void SetDer(NodoArbol Der) {
        this.Der = Der;
    }

    public NodoArbol DarSig() {
        return sig;
    }

    public void SetSig(NodoArbol sig) {
        this.sig = sig;
    }
}

