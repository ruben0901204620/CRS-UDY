package org.lpz.principal;

import org.lpz.modelo.Cliente;
import org.lpz.modelo.OrdenCompra;
import org.lpz.modelo.Producto;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compras Tecnología.");
        orden1.setCliente(new Cliente("Ruben", "lopez"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Samsung", "Galaxy S23 Ultra", 1299.99f));
        orden1.addProducto(new Producto("Apple", "Macbook Pro", 1999.00f));
        orden1.addProducto(new Producto("Sony", "PlayStation 5", 499.99f));
        orden1.addProducto(new Producto("Logitech", "MX Master 3S", 99.99f));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setCliente(new Cliente("Carlos", "Perez"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("LG", "Microondas Grill 30L", 109990));
        orden2.addProducto(new Producto("Daewoo", "Refrigerador Top Mount", 349990));
        orden2.addProducto(new Producto("Bosch", "Lavavajillas 12 servicios", 429990));
        orden2.addProducto(new Producto("Thomas", "Freidora de aire 5L", 89990));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setCliente(new Cliente("Marta", "López"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Sodimac", "Pala punta mango madera", 7990));
        orden3.addProducto(new Producto("Bosca", "Estufa a leña 8000 kcal", 179990));
        orden3.addProducto(new Producto("Volcan", "Yeso en polvo 25kg", 4890));
        orden3.addProducto(new Producto("Brico", "Carretilla reforzada 60L", 45990));

        


    }
}
