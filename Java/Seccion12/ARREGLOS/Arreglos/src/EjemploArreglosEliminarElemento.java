import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese un numero: ");
            a[i] = entrada.nextInt();
        }
        System.out.println();

        System.out.print("Ingrese un numero entre 0 y 9: ");
        int posicion = entrada.nextInt();

        for(int i = posicion; i < a.length-1; i++) {
            a[i] = a[i+1];
        }

        /* for (int i = 0; i < a.length-1; i++) {
            System.out.println("i["+i +"] => " + a[i]);
        } */

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length);

        for(int i = 0; i < b.length; i++) {
            System.out.println(i+" => " + b[i]);
        }


    }
}
