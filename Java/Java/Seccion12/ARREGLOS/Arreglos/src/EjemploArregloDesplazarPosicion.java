import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int ultimo;

        for ( int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();

        }

        ultimo = numeros[numeros.length-1];

        for(int i = numeros.length-2; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[0] = ultimo;

        System.out.println("El arreglo:");
        for (int i = 0; i < numeros.length; i++ ) {
            System.out.println(numeros[i]);
        }

    }
}
