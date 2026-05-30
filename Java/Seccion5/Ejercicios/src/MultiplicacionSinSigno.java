import java.util.Scanner;

public class MultiplicacionSinSigno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, resultado=0;

        
        System.out.print("Ingrese el primer valor: ");
        n1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        n2 = entrada.nextInt();

        boolean negativo = (n1 < 0 && n2 >= 0) || (n1 >= 0 && n2 < 0);

        int a = Math.abs(n1);
        int b = Math.abs(n2);

        for(int i = 0; i < a; i++) {
            resultado += b;

        }

        if (negativo) {
            resultado = -resultado;
        }

        System.out.println("La multiplicacion de " + n1 + " * " + n2 + " es de: " + resultado);
    

    }
}
