import java.util.Scanner;

public class EjemploArregloBuscarNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i < a.length; i++) {
            System.out.print("ingrese un numero: ");
            a[i] = entrada.nextInt();
        }

        System.out.print("\r\ningrese un numero a buscar: ");
        int num = entrada.nextInt();

        int i = 0;
        while (i < a.length && a[i] != num) {
            i++;
        }

        if(i == a.length) {
            System.out.println("numero no encontrado.");
        } else if ( a[i] == num) {
            System.out.println("Numero encontrado en la posicion: " + i);
        }

    }
}
