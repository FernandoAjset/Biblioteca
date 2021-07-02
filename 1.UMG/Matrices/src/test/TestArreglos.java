
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[3];

        edades[0]=10;
        //edades[4]=10;
        
        for (int i =0; i<edades.length; i++)
        {
            System.out.println("edades elemento" + i +" : " + edades[i]);
        }
        
        String frutas [] = {"Pera","Manzana","Banano","Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " +i+" = "+ frutas[i]);
        }
    }
}
