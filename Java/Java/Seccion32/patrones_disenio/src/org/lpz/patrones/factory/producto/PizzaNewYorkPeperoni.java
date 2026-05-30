package org.lpz.patrones.factory.producto;

import org.lpz.patrones.factory.PizzaProducto;

import java.util.ArrayList;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza peperoni New York";
        masa = "Masa delgada a la pieda";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceteitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min a 90 °c");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");

    }
}
