package listas;

/**
 *
 * @author Fernando Ajset
 */
import java.util.Scanner;

public class Lista {

    public Nodo Inicio;

    Lista() {
        Inicio = null;
    }

    public void IngresarInicio(int pDato) {
        if (Inicio == null) {
            Inicio = new Nodo(pDato);
        } else {
            Nodo nuevo = new Nodo(pDato);
            nuevo.setSig(Inicio);
            Inicio = nuevo;
        }
    }

    public void IngresarFinal(int pDato) {
        if (Inicio == null) {
            Inicio = new Nodo(pDato);
        } else {
            Nodo aux = Inicio;
            while (aux.novacio()) {
                aux = aux.DarSig();
            }
            aux.setSig(new Nodo(pDato));
        }
    }

//    public Nodo EliminarInicio() {
//        if (Inicio != null) {
//            Nodo aux = Inicio;
//            Inicio = Inicio.DarSig();
//            return aux;
//        } else {
//            System.out.println("Inicio vacio");
//            return null;
//        }
//    }

    public static void Ingresosi(int Pdato, Lista l1) {

        System.out.println("Desea agregar el nodo al Inicio o Fin?: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if (name.equalsIgnoreCase("inicio")) {
            l1.IngresarInicio(Pdato);
        } else {
            l1.IngresarFinal(Pdato);
        }

    }

    public void Recorrer() {
        Nodo aux = Inicio;
        while (aux != null) {
            System.out.println("Dato: " + aux.DarDato());
            aux = aux.DarSig();
        }
    }

    public String DarLista() {
        String lista = new String();
        Nodo aux = Inicio;
        while (aux != null) {
            lista += String.valueOf(aux.DarDato()) + "   ";
            aux = aux.DarSig();
        }
        return lista;
    }

public Nodo Existe(int dato) {
        Nodo aux = Inicio;
        Nodo aux2=null;
        while (aux != null) {
            if (aux.DarDato()==dato) {
                aux2=aux;
            }
            aux= aux.DarSig();
        }
        return aux2;
        }

    
public Nodo EliminarInicio() {  //ELIMINA EL NODO INICIO, ASUMIENDO QUE EL ULTIMO NODO DE LA LISTA
				//SE INGRESA AL INICIO. 
        if (Inicio != null) {
            Nodo aux = Inicio;
            Inicio = Inicio.DarSig();
            return aux;
        } else {
            System.out.println("Inicio vacio");
            return null;
        }
    }
    




    public Nodo SiExiste(int pdato) {
        Nodo Respuesta=null;
        Nodo aux = Inicio;
        while (aux != null) {
            if (pdato == aux.DarDato()) {
                Respuesta=aux;
            }
            aux= aux.DarSig();
        }
        return Respuesta;
        }    
    
    
    public Nodo DarUltimo() {
        Nodo aux = Inicio;
        while (aux.DarSig() != null) {
            aux = aux.DarSig();
        }
        return aux;
    }

    public void BuscarPosicion(int dato) {
        Nodo aux = Inicio;
        int pos = 1;
        boolean existe = false;
        while (aux != null) {
            if (aux.DarDato() == dato) {
                System.out.println("Dato " + dato + " en posicion " + pos);
                existe = true;
            }
            aux = aux.DarSig();
            pos++;
        }
        if (existe != true) {
            System.out.println("DATO NO EXISTE");
        }
    }

    public static void main(String args[]) {
        Lista l1 = new Lista();
        //INGRESO DE DATOS A LISTA 1
        l1.IngresarFinal(1);
        l1.IngresarFinal(2);
        l1.IngresarFinal(3);
     
        int n=10; //INGRESO DE DATO A BUSCAR
//        if(l1.Existe(n)!=null){
//            System.out.println("Si existe en la lista el numero " + l1.SiExiste(n).DarDato());
//        }
//        else{
//            System.out.println("n = No existe en la lista");
//        }
    }
}
