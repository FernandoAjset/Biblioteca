package arbol;

public class ListaArbol {

    NodoArbol inicio;

    public void IngresarInicio(String pDato) {

        if (inicio == null) {

            inicio = new NodoArbol(pDato);

        } else {

            NodoArbol nuevo = new NodoArbol(pDato);

            nuevo.SetSig(inicio);

            inicio = nuevo;

        }

    }

    public void IngresarFinal(String pDato) {

        if (inicio == null) {

            inicio = new NodoArbol(pDato);

        } else {

            NodoArbol nuevo = new NodoArbol(pDato);

            DarUltimo().SetSig(nuevo);

        }//fin if

    }

    public NodoArbol DarUltimo() {

        NodoArbol aux = inicio;

        while (aux.DarSig() != null) {

            aux = aux.DarSig();

        }

        return aux;

    }

    public void Recorrer() {

        NodoArbol aux = inicio;

        while (aux != null) {

            System.out.println(aux.DarDato());

            aux = aux.DarSig();

        }

    }
}
