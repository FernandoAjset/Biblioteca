
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        
        imprimirNumeros(5,6,4,2,1,0);
        imprimirNumeros(1,2);
        
        variosParametros("Juan",8,2,5,3);
        
        
        
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: "+numeros[i]);
        }
    }
}
