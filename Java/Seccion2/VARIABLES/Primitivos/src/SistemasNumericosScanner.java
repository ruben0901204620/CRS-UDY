import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        // String numeroStr = entrada.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = entrada.nextInt(); // Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero decimal: " + numeroDecimal);

        // Convertir numero decimal a binario.
        String resltadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        // Sistema Octal.
        String resultadoOctal = "Numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        // Sistema Hexadecimal.
        String resultadoHexa = "Numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resltadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println(mensaje);

    }
}
