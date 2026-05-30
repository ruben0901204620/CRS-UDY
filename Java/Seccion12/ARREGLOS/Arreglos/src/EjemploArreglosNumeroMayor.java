import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Ingrese 5 numeros:");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }

        int max = 0;
        for(int i = 1; i < a.length; i++) {
            max = (a[max] > a[i])? max: i;
        }

        System.out.println("numero mayor: " + a[max]);

    }
}
