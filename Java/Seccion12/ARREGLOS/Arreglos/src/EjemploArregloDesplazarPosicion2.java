import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int elemento, posicion;

        for ( int i = 0; i < numeros.length-1; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();

        }

        System.out.print("Ingrese un nuevo elemento: ");
        elemento = entrada.nextInt();

        System.out.print("Posicion donde agregar (de 0 a 9): ");
        posicion = entrada.nextInt();

        for(int i = numeros.length-2; i >= posicion; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[posicion] = elemento;

        System.out.println("El arreglo:");
        for (int i = 0; i < numeros.length; i++ ) {
            System.out.println(numeros[i]);
        }

    }
}
