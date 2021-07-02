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
//            } else {
//                //System.out.println("No hay coincidencias para "+buscar);
//            }
//        }
//        if (respuesta.isEmpty()) {
//            System.out.println("No hay coincidencias");
//        } else {
//            System.out.println("R: " + respuesta);
//        }
        return respuesta;
    }

    public void Recorrer(String busqueda) { //PRUEBA, BUSCAR POR CLAVE CONSOLA
        String buscar = new String();
        String respuesta = new String();
        buscar = busqueda;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {                
                respuesta += tabla[x].Recorrer(buscar);
            } else {
                //System.out.println("No hay coincidencias para "+buscar);
            }
        }
        if (respuesta.isEmpty()) {
            System.out.println("No hay coincidencias");
        } else {
            System.out.println("R: " + respuesta);
        }
    }

    public static void main(String args[]) {

        HashCerrada h1 = new HashCerrada(10);
        ArbolBinario arbol = new ArbolBinario();
        String nombre = new String();
        String claves = new String();

//PRUEBA DE HASH Y VISUALIZACION EN CONSOLA, ATTE. EDGAR AJSET
        nombre = "Selva";
        claves = "Leon,Tigre,Niño,Personas";
        if (h1.existeLibro(nombre) == false) {
            h1.IngresarLibro(nombre, claves);
        }

        nombre = "Biblia";
        claves = "Pedro,Jesus,Personas,Iglesia,Cruz";
        if (h1.existeLibro(nombre) == false) {
            h1.IngresarLibro(nombre, claves);
        }

        nombre = "Biblia"; //ESTA NO SE INSERTA, POR EXISTIR YA EL NOMBRE DEL LIBRO
        claves = "Maria,Cielo";
        if (h1.existeLibro(nombre) == false) {
            h1.IngresarLibro(nombre, claves);
        }

        nombre = "Baldor";
        claves = "Mate,Signo,Operaciones,calculo";
        if (h1.existeLibro(nombre) == false) {
            h1.IngresarLibro(nombre, claves);
        }

        nombre = "ams";
        claves = "Planeta,Estrella,personas";
        if (h1.existeLibro(nombre) == false) {
            h1.IngresarLibro(nombre, claves);
        }

        nombre = "sam";
        claves = "Personas,vida,mar,ecosistema";
        if (h1.existeLibro(nombre) == false) {
            h1.IngresarLibro(nombre, claves);
        }
        System.out.println("BUSQUEDA POR CONSOLA");
        h1.Recorrer("personas");
        
        System.out.println("\nRETORNO DE CADENA PARA INTERFAZ");
        System.out.println(h1.BuscarPorClaves("personas"));
        System.out.println(h1.BuscarPorClaves("personasss"));

    }
}
