import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr= JOptionPane.showInputDialog(null,"Ingrese un numero entero: ");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null , "Error: Debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero decimal: " + numeroDecimal);

        // Convertir numero decimal a binario.
        String resltadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resltadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("Numero decimal = " + numeroBinario);

        // Sistema Octal.
        String resultadoOctal = "Numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println(numeroOctal);

        // Sistema Hexadecimal.
        String resultadoHexa = "Numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        int numeroHexa = 0x1e;
        System.out.println(numeroHexa);

        String mensaje = resltadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
