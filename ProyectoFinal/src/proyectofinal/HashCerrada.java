package proyectofinal;

/**
 *
 * @author balvarado
 */
import arbolBinario.*;

public class HashCerrada {

    protected int size;
    protected Arbol clave;
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

    public void Ingresar(String pDato, String palabras) {
        int indice = hash(pDato);
        if (tabla[indice] == null) {
            tabla[indice] = new ListaEnlazada();
        }
        tabla[indice].IngresarFinal(pDato, palabras);
    }

    public String buscarClave(String pDato) {
        String respuesta = new String();
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                //System.out.println("Indice: " + x);
                if (tabla[x].Recorrer(pDato) != null) {
                    respuesta += tabla[x].Recorrer(pDato);
                }
            } else {
                //System.out.println("Indice: " + x + " vacío.");
            }
        }
        System.out.println("respuesta = " + respuesta);
        return respuesta;
    }

    public NodoLista BuscarTitulo(String tLibro) {
        NodoLista respuesta = null;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                respuesta = tabla[x].SiExiste(tLibro);
            }
        }
        return respuesta;
    }

    public static void main(String args[]) {
        HashCerrada h1 = new HashCerrada(15);
        String palabras;

        h1.Ingresar("Estudiantes", "juan,Pedro,Maria");
        h1.Ingresar("Personas", "Karla,Fernando,Brizeth,juan");
        h1.Ingresar("Prueba", "Maria,juan,Brizeth");

        //h1.Recorrer();
        String busqueda = "estudiantes";
        if (h1.BuscarTitulo(busqueda) != null) {
            System.out.println(h1.BuscarTitulo(busqueda).DarDato());
            System.out.println(h1.BuscarTitulo(busqueda).palabras.Preorden());
        } else {
            System.out.println("NO HAY COINCIDENCIA");
        }

        busqueda = "juan,brizeth";
        String respuesta = new String();
        String arregloPalabras[] = busqueda.split(",");
        for (int i = 0; i < arregloPalabras.length; i++) {
            //this.palabras.insertar(arregloPalabras[i]);
            if (h1.buscarClave(arregloPalabras[i]).isEmpty() == false) {
                System.out.println(h1.buscarClave(arregloPalabras[i]));
                respuesta += arregloPalabras[i] + " esta en: " + h1.buscarClave(arregloPalabras[i]) + "\n";
            }

        }

        if (respuesta.isEmpty() == false) {
            System.out.println(respuesta);
        } else {
            System.out.println("No hay");
        }

    }

}
