import java.util.Scanner;

public class NumOrdenados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        double n1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double n2 = entrada.nextDouble();

        String mayor = n1 > n2 ? ("numero mayor: " + n1) : (("numero mayor: " + n2));
        String menor = n1 < n2 ? ("numero menor: " + n1) : (("numero menor: " + n2));
        System.out.println(mayor);
        System.out.println(menor);

    }
}
