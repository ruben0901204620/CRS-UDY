import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int elemento, posicion, ultimo;

        for ( int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();

        }

        System.out.print("Ingrese un nuevo elemento: ");
        elemento = entrada.nextInt();

        System.out.print("Posicion donde agregar (de 0 a 9): ");
        posicion = entrada.nextInt();

        ultimo = numeros[numeros.length-1];

        for(int i = numeros.length-2; i >= posicion; i--) {
            numeros[i+1] = numeros[i];
        }
        int[] b = new int[numeros.length+1];
        System.arraycopy(numeros, 0, b, 0, numeros.length);
        numeros = b;
        numeros[posicion] = elemento;

        numeros[numeros.length-1] = ultimo;
        System.out.println("El arreglo:");
        for (int i = 0; i < numeros.length; i++ ) {
            System.out.println("["+i+"] = "+numeros[i]);
        }

    }
}
