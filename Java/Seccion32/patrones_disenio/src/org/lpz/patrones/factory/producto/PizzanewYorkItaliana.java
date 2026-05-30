package org.lpz.patrones.factory.producto;

import org.lpz.patrones.factory.PizzaProducto;

public class PizzanewYorkItaliana extends PizzaProducto {

    public PizzanewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Queso Mozzzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Chorizo");
        ingredientes.add("Champiñones");
    }


    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120 °c");

    }

    @Override
    public void cortar() {
        System.out.println("Cortnado la pizza en triangulos grandes.");
    }
}
