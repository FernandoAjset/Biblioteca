package tablahash;

import arbol.ArbolBinario;

public class ListaEnlazada {

    protected NodoLista inicio;

    public void IngresarFinal(String nombre, String claves) {
        if (inicio == null) {

            String cadenaClaves[] = claves.split(",");
            ArbolBinario arbolClave = new ArbolBinario();
            for (int i = 0; i < cadenaClaves.length; i++) {
                arbolClave.IngresarLibro(cadenaClaves[i]);
            }
            inicio = new NodoLista(nombre, arbolClave);
        } else {
            String cadenaClaves[] = claves.split(",");
            ArbolBinario arbolClave = new ArbolBinario();
            for (int i = 0; i < cadenaClaves.length; i++) {
                arbolClave.IngresarLibro(cadenaClaves[i]);
            }
            NodoLista nuevo = new NodoLista(nombre, arbolClave);
            DarUltimo().SetSig(nuevo);
        }
    }

    public NodoLista DarUltimo() {
        NodoLista aux = inicio;
        while (aux.DarSig() != null) {
            aux = aux.DarSig();
        }
        return aux;
    }

    public NodoLista BuscarNodo(String nombre) {
        NodoLista aux = inicio;
        NodoLista aux2 = null;
        while (aux != null) {
            if (aux.DarNombre().equalsIgnoreCase(nombre)) {
                aux2 = aux;
            }
            aux = aux.DarSig();
        }
        return aux2;
    }

    public NodoLista EliminarInicio() {
        NodoLista aux = inicio;
        inicio = aux.DarSig();
        return aux;
    }

    public String Recorrer(String pBusqueda) {
        boolean existe = false;
        String respuesta = new String();
        NodoLista aux = inicio;
        while (aux != null) {
            String claves = aux.DarClaves().Preorden();
            String arregloClaves[] = claves.split(",");//claves.split(",");
            for (int i = 0; i < arregloClaves.length; i++) {
                if (arregloClaves[i].equalsIgnoreCase(pBusqueda) != false) {
                    existe = true;
                    if (existe != false) {
                        respuesta += "\t"+"*"+aux.DarNombre() + "\n";
                        // System.out.println(respuesta);
                    }
                }
            }
            aux = aux.DarSig();
        }
        return respuesta;
    }
}
