package org.lpz.appFacturas;

import org.lpz.appFacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNit("5555-5");
        cliente.setNombre("Ruben");

        System.out.print("Ingrese una descripcion: ");
        Factura factura = new Factura(entrada.nextLine(), cliente);

        Producto producto;
        int cantidad;

        System.out.println();

        for(int i = 0; i < 2; i++) {
           producto = new Producto();
            System.out.print("Ingrese producto n." + producto.getCodigo() + ": ");
            producto.setNombre(entrada.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(entrada.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            cantidad = entrada.nextInt();

            // ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(new ItemFactura(cantidad, producto));

            System.out.println();

        }

        System.out.println(factura);
        //System.out.println(factura.generarDetalle());

    }

}
