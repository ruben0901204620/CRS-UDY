import java.util.Scanner;

public class OperadorternarioNumMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int max = 0;

        System.out.print("Ingrese el primer valor:");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo valor:");
        int num2 = entrada.nextInt();

        System.out.print("Ingrese el tercer valor:");
        int num3 = entrada.nextInt();

        System.out.print("Ingrese el cuarto valor:");
        int num4 = entrada.nextInt();

        max = (num1 > num2)? num1 : num2;
        max = ( max > num3 )? max : num3;
        max = ( max > num4 )? max : num4;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("num3 : " + num3);
        System.out.println("num4 : " + num4);
        System.out.println("El numero mayor es: " + max);

    }
}
