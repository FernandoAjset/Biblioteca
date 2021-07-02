/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
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

    public void Ingresar(String pDato) {
        int indice = hash(pDato);
        if (tabla[indice] == null) {
            tabla[indice] = new ListaEnlazada();
        }
        tabla[indice].IngresarFinal(pDato);
    }

    public void Recorrer() {
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                System.out.println("Indice: " + x);
                tabla[x].Recorrer();
            } else {
                System.out.println("Indice: " + x + " vacío.");
            }
        }
    }

    public boolean Buscar(String dato) {
        boolean respuesta = false;
        for (int x = 0; x < size; x++) {
            if (tabla[x] != null) {
                if(tabla[x].Existe(dato)!=false)
                {
                    respuesta=true;
                }
            }
        }
        return respuesta;
    }

    public static void main(String args[]) {
        HashCerrada h1 = new HashCerrada(10);
        h1.Ingresar("Samuel");
        h1.Ingresar("sam");
        h1.Ingresar("mas");
        h1.Ingresar("asm");
        h1.Ingresar("saM");
        h1.Ingresar("Mas");
        h1.Ingresar("Anai");
        h1.Ingresar("Edgar");
        h1.Ingresar("Luis");
        h1.Ingresar("Erick");
        //h1.Recorrer();
        
        
        System.out.println(h1.Buscar("samuel"));
        System.out.println(h1.Buscar("Samuel"));
        System.out.println(h1.Buscar("samu"));
        
         System.out.println(h1.Buscar("anai"));
        System.out.println(h1.Buscar("Anai"));
        System.out.println(h1.Buscar("anahí"));
        
         System.out.println(h1.Buscar("edgar"));
        System.out.println(h1.Buscar("EDGAR"));
        System.out.println(h1.Buscar("ERGAR"));
    }

}
