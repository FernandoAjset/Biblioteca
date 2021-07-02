
/**
 *
 * @author 187506-EDGARFERNANDO
 */
public class Nodo {

    int dato;
    protected Nodo raiz;
    protected Nodo izq;
    protected Nodo Der;
    protected Nodo sig;

   public Nodo(int pDato){

     dato = pDato;      

   }   

   public int DarDato(){

     return dato;

   }   

    public void SetDato(int dato) {
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
}

