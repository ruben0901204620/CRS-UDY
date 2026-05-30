import java.util.Arrays;
import java.util.Scanner;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         /*Producto orden1 = new Producto("Samsung", "Galaxy", 700);
        Producto orden2 = new Producto("Xiaomi", "Redmi", 200);
        Producto orden3 = new Producto("Huawei", "Note", 400); */

        String orden_fabricante;
        String orden_nombre;
        int orden_precio;

        Producto[] ordenes = new Producto[3];
        for(int i = 0; i < ordenes.length; i++) {
            System.out.print(i+1 + ". Ingrese el fabricante: ");
            orden_fabricante = entrada.next();
            System.out.print(i+1 + ". Ingrese el nombre: ");
            orden_nombre = entrada.next();
            System.out.print(i+1 + ". Ingrese el precio: ");
            orden_precio = entrada.nextInt();
            ordenes[i] = new Producto(orden_fabricante, orden_nombre, orden_precio);

        }

        Arrays.sort(ordenes);
        for(Producto orden: ordenes) {
            System.out.println(orden);
        }


    }
}
