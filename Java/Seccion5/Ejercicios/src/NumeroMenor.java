import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantdad de numeros (minimo 10): ");
        int cantidad = entrada.nextInt();

        if (cantidad < 10) {
            System.out.printf("el minimo valor para comparar es 10.");
            return;
        }

        int numero;
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i < cantidad; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            numero = entrada.nextInt();

            if(numero < menor) {
                menor = numero;

            }

        }
        System.out.println("El numero menor es: " + menor);

        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

    }
}
