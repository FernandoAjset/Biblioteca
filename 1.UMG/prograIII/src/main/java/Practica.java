
public class Practica {

    static void intercambiar(int[] v, int x, int y) {
        int aux = v[x];
        v[x] = v[y];
        v[y] = aux;
    }

    static void ordIntercambio(int a[], int n) {

        for (int i = 0; i < (n - 1); i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 3;
        a[1] = 2;
        a[2] = 5;
        a[3] = 7;
        a[4] = 1;

        //IMPRIMIR ORIGINAL
        System.out.println("***IMPRIMIENDO VECTOR ORIGINAL***");
        for (int i = 0; i < 5; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
        ordIntercambio(a, 5);

        //IMPRIMIR ORDENADO
        System.out.println("\n***IMPRIMIENDO VECTOR CON DATOS ORDENADOS***");
        for (int i = 0; i < 5; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }

}
