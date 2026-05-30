package org.lpz.patrones.factory.producto;

import org.lpz.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California queso";
        masa = "Masa de piedra delgada";
        salsa = "alsa de tomate rucula";
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min a 100 °c");

    }

    @Override
    public void cortar() {
        System.out.println("Coortando lla pizza en pequeñoa triangulos.");

    }
}
