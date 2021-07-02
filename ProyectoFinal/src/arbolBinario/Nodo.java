package arbolBinario;

/**
 *
 * @author balvarado
 */

public class Nodo {

    String dato;
    protected Nodo raiz;
    protected Nodo izq;
    protected Nodo Der;
    protected Nodo sig;

   public Nodo(String pDato){

     dato = pDato;      

   }   

   public String DarDato(){

     return dato;

   }   

    public void SetDato(String dato) {
        this.dato = dato;
    }

    public Nodo DarRaiz() {
        return raiz;
    }

    public void SetRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo DarIzq() {
        return izq;
    }

    public void SetIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo DarDer() {
        return Der;
    }

    public void SetDer(Nodo Der) {
        this.Der = Der;
    }

    public Nodo DarSig() {
        return sig;
    }

    public void SetSig(Nodo sig) {
        this.sig = sig;
    }
    
public void Eliminar() {
    if (raiz != null) {
      raiz.Eliminar();
      raiz = null;
    }
    
    if (izq != null) {
      izq.Eliminar();
      izq = null;
    }
    if (Der != null) {
      Der.Eliminar();
      Der = null;
    }
    dato="";
}
}

