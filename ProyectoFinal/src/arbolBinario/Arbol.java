package arbolBinario;

/**
 *
 * @author balvarado
 */
public class Arbol {

    String resultado = new String();
    public Nodo raiz;
    int altura;
    int cant;
    int suma;
    int aux;

    public Arbol() {

        raiz = null;

    }

    public Arbol(Nodo raiz) {

        this.raiz = raiz;

    }

    public Nodo DarRaiz() {

        return raiz;

    }

    boolean EstaVacio() {

        return raiz == null;

    }

    public void insertar(String dato) {//Insetar datos en el arbol
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, String dato) {
        if (dato.compareTo(padre.DarDato()) > 0) {
            if (padre.DarDer() == null) {
                padre.SetDer(new Nodo(dato));
            } else {
                this.insertar(padre.DarDer(), dato);
            }
        } else {
            if (padre.DarIzq() == null) {
                padre.SetIzq(new Nodo(dato));
            } else {
                this.insertar(padre.DarIzq(), dato);
            }
        }
    }

    public String Preorden() {

        return preorden(raiz);
        //return resultado;
    }

    public String preorden(Nodo r) {
        //String respuesta = new String();
        if (r != null) {

            this.resultado += r.DarDato() + " ";

            preorden(r.DarIzq());

            preorden(r.DarDer());

        }
        return resultado;
    }

    public boolean Buscar(String pDato) {//busqueda recursivo
        boolean respuesta = false;
        if (buscar(raiz, pDato) != null) {
            respuesta = true;
            //System.out.println(pDato + " si existe!");

        } else {

            //System.out.println(pDato + "No Existe!");

        }
        return respuesta;
    }

    protected Nodo buscar(Nodo pRaiz, String pDato) {

        if (pRaiz == null) {

            return null;

        } else if (pRaiz.DarDato().equalsIgnoreCase(pDato)) {

            return pRaiz;

        } else if (pDato.compareTo(pRaiz.DarDato()) > 0) {
            return buscar(pRaiz.DarIzq(), pDato);
        } else {
            return buscar(pRaiz.DarDer(), pDato);
        }
    }

    private void retornarAltura(Nodo reco, int nivel) {//retorna la altura
        if (reco != null) {
            retornarAltura(reco.DarIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.DarDer(), nivel + 1);
        }
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void cantidad(Nodo reco) {

        if (reco != null) {
            cant++;
            cantidad(reco.izq);
            cantidad(reco.Der);
        }
    }

    public int cantidad() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    public String inorden(Nodo nodo) { //recorrido en orden
        String respuesta = new String();
        if (nodo.DarIzq() != null) {
            inorden(nodo.DarIzq());
        }
        System.out.println(nodo.DarDato());
        if (nodo.DarDer() != null) {
            inorden(nodo.DarDer());
        }
        return respuesta;
    }

    public void postorden(Nodo nodo) {//recorrido posorden
        if (nodo.DarIzq() != null) {
            postorden(nodo.DarIzq());
        }
        if (nodo.DarDer() != null) {
            postorden(nodo.DarDer());
        }
        System.out.println(nodo.DarDato());
    }

    public static void main(String args[]) {
        Arbol a1 = new Arbol();

        a1.insertar("Jorge");
        a1.insertar("Pedro");
        a1.insertar("Luis");

       // System.out.println(a1.Preorden());
        System.out.println(a1.Buscar("jorge"));
        System.out.println(a1.Buscar("jssorge"));
    }
}
