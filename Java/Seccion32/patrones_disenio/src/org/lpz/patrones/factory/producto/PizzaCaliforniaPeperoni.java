package org.lpz.patrones.factory.producto;

import org.lpz.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza California peperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Peperoni");
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min a 55 °c");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando lla pizza enn pequeños rectangulos");
    }
}
