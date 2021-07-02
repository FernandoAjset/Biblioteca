
public class ArbolBinario {

    protected Nodo raiz;
    int altura;
    int cant;
    int suma;
    int aux;
    int sumar;

    public ArbolBinario() {

        raiz = null;

    }

    public ArbolBinario(Nodo raiz) {

        this.raiz = raiz;

    }

    public Nodo DarRaiz() {

        return raiz;

    }

    boolean EstaVacio() {

        return raiz == null;

    }

    public void Ingresar(int pDato) {

        raiz = InsertarNodo(raiz, pDato);

    }

    public Nodo InsertarNodo(Nodo subArbol, int pDato) {

        if (subArbol == null) {

            subArbol = new Nodo(pDato);

        } else if (pDato < subArbol.DarDato()) {

            Nodo iz = InsertarNodo(subArbol.DarIzq(), pDato);

            subArbol.SetIzq(iz);

        } else if (pDato > subArbol.DarDato()) {

            Nodo de = InsertarNodo(subArbol.DarDer(), pDato);

            subArbol.SetDer(de);

        } else {
            System.out.println("Nodo ya existe");
        }

        return subArbol;

    }

    public void Preorden() {

        preorden(raiz);

    }

    public void preorden(Nodo r) {

        if (r != null) {

            System.out.print(r.DarDato() + " ");

            preorden(r.DarIzq());

            preorden(r.DarDer());

        }

    }

//METODO PARA BUSCAR RECURSIVO
    public void Buscar(int pDato) {

        if (buscar(raiz, pDato) != null) {

            System.out.println(pDato + " si existe!");

        } else {

            System.out.println(pDato + "No Existe!");

        }

    }

    protected Nodo buscar(Nodo pRaiz, int pDato) {

        if (pRaiz == null) {

            return null;

        } else if (pRaiz.DarDato() == pDato) {

            return pRaiz;

        } else if (pRaiz.DarDato() > pDato) {
            return buscar(pRaiz.DarIzq(), pDato);
        } else {
            return buscar(pRaiz.DarDer(), pDato);
        }
    }

//METODO PARA BUSCAR ITERADO
    public boolean BuscarIterado(int pDato) {
        boolean existe = false;

        Nodo aux = raiz;

        while (!existe && aux != null) {

            if (aux.DarDato() == pDato) {
                existe = true;
            } else if (pDato < aux.DarDato()) {
                aux = aux.DarIzq();
            } else {
                aux = aux.DarDer();
            }

        }

        return existe;

    }

//METODO ALTURA
    private void retornarAltura(Nodo reco, int nivel) {
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

//CANTIDAD DE NODOS
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

//RECORRER EN ORDEN
    public void inorden(Nodo nodo) {
        if (nodo.DarIzq() != null) {
            inorden(nodo.DarIzq());
        }
        System.out.println(nodo.DarDato());
        if (nodo.DarDer() != null) {
            inorden(nodo.DarDer());
        }
    }

//RECORRER POSORDEN
    public void postorden(Nodo nodo) {
        if (nodo.DarIzq() != null) {
            postorden(nodo.DarIzq());
        }
        if (nodo.DarDer() != null) {
            postorden(nodo.DarDer());
        }
        System.out.println(nodo.DarDato());
    }

    public int sumaEnteros(Nodo raiz) {

        suma = suma + raiz.dato;
        if (raiz.izq == null && raiz.Der == null) {
            return suma;
        } else {
            if (raiz.Der == null) {
                sumaEnteros(raiz.izq);
            } else if (raiz.izq == null) {
                sumaEnteros(raiz.Der);
            }
        }
        return suma;
    }

    public int sumaArbol(Nodo r) {
        int aux = r.dato;
        sumar = sumar + aux;
        if (r.izq == null) {
            if (r.Der == null) {
                return sumar;
            } else {
                if (r.Der == null) {
                    sumaEnteros(r.izq);
                } else if (r.izq == null) {
                    sumaArbol(r.Der);
                }
            }
        }
        return sumar;
    }

    public static void main(String args[]) {

        ArbolBinario a1 = new ArbolBinario();

        a1.Ingresar(1);
        a1.Ingresar(2);
        //       a1.Ingresar(3);
        a1.Ingresar(5);
        a1.Ingresar(7);

        //       System.out.println(a1.sumaEnteros(a1.raiz));
        System.out.println(a1.sumaArbol(a1.raiz));
//
//
//    System.out.println("Recorrido en preorden: "); 
//
//    a1.Preorden();
//
//      System.out.println("\n\n**Buscar Dato en Arbol**");
//    a1.Buscar(10);
//    
//      System.out.println("\n**ALTURA DEL ARBOL***");
//      System.out.println(a1.retornarAltura());
//      
//      System.out.println("\n**CANTIDAD DE NODOS***");
//      System.out.println(a1.cantidad());
//      
//      System.out.println("\n**EN ORDEN***");
//      a1.inorden(a1.raiz);
//      
//      System.out.println("\n**POSORDEN***");
//      a1.postorden(a1.raiz);
    }
}
