import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la factura: ");
        String nombreFactura =  entrada.nextLine();

        System.out.print("Ingrese el precio del producto 1: ");
        double producto1 = entrada.nextDouble();

        System.out.print("Ingrese el precio del producto 2: ");
        double producto2 = entrada.nextDouble();

        double impuesto = (producto1 + producto2) * 0.19;

        double total = (producto1 + producto2) + impuesto;

        System.out.println("\nLa factura" + nombreFactura + " tiene un total bruto de: " + (producto1+producto2) + "\ncon un impuesto de: " + impuesto);
        System.out.println("y el monto despues del impuesto es de: " + total);

    }
}
