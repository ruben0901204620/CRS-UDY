package org.lpz.patrones.factory.producto;

import org.lpz.patrones.factory.PizzaProducto;
import org.lpz.patrones.factory.PizzeriaCaliforniaFactory;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California vegetariana";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ licght";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 45 min a 130 °c");

    }

    @Override
    public void cortar() {
        System.out.println("Coortando la pizza en pequeñoa triangulos.");

    }
}
