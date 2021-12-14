package tablahash;

import arbol.ArbolBinario;

public class HashCerrada {

    protected int size;

    ListaEnlazada tabla[];

    public HashCerrada(int pSize) {

        size = pSize;

        tabla = new ListaEnlazada[pSize];

    }

    public int hash(String pDato) {

        int indice;

        int valor = 0;

        char[] ascii = pDato.toCharArray();

        for (char ch : ascii) {

            valor = valor += (int) ch;

        }

        indice = valor % size;

        return indice;

    }

    public void IngresarLibro(String nombre, String claves) {

        int indice = hash(nombre);

        if (tabla[indice] == null) {

            tabla[indice] = new ListaEnlazada();

        }

        tabla[indice].IngresarFinal(nombre, claves);
    }

    public NodoLista BuscarLibro(String nombre) {
        int indice = hash(nombre);
        NodoLista mostrar = null;
        boolean buscar = false;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                if (tabla[x].BuscarNodo(nombre) != null) {
                    if (tabla[x].BuscarNodo(nombre).DarNombre().equalsIgnoreCase(nombre)) {
                        mostrar = tabla[x].BuscarNodo(nombre);
                        return mostrar;
                    }
                }
            }
        }
        return mostrar;
    }

    public boolean existeLibro(String nombre) {
        int indice = hash(nombre);
        boolean respuesta = false;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                if (tabla[x].BuscarNodo(nombre) != null) {
                    if (tabla[x].BuscarNodo(nombre).DarNombre().equalsIgnoreCase(nombre)) {
                        respuesta = true;
                    }
                }
            }
        }
        return respuesta;
    }

//METODO PARA LA BUSQUEDA POR CLAVES, USADO EN INTERFAZ
    public String BuscarPorClaves(String busqueda) {
        String buscar = new String();
        String respuesta = new String();
        buscar = busqueda;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                respuesta += tabla[x].Recorrer(buscar);
            }
        }
        return respuesta;
    }

    public void Recorrer(String busqueda) { //PRUEBA, BUSCAR POR CLAVE CONSOLA
        String buscar = new String();
        String respuesta = new String();
        buscar = busqueda;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                respuesta += tabla[x].Recorrer(buscar);
            }
        }
        if (respuesta.isEmpty()) {
            System.out.println("No hay coincidencias");
        } else {
            System.out.println("R: " + respuesta);
        }
    }
}
