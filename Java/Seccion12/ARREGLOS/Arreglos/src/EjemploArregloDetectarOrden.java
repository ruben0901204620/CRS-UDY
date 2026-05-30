import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 numeros:");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }

        boolean ascedente = false;
        boolean descedente = false;
        for(int i = 0; i < a.length-1; i++) {
            if(a[i] > a[i+1]) {
                descedente = true;
            }

            if (a[i] < a[i+1]) {
                ascedente = true;
            }
        }

        if(ascedente == true && descedente == true) {
            System.out.println("Arreglo: desordenado");
        }

        if(ascedente == false && descedente == false) {
            System.out.println("Arreglo: son todos iguales");
        }

        if(ascedente == true && descedente == false) {
            System.out.println("Arreglo: ascendenteo");
        }

        if(ascedente == false && descedente == true) {
            System.out.println("Arreglo: descedenteo");
        }
    }
}
