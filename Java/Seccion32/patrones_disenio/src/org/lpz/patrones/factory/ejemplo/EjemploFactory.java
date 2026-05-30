package org.lpz.patrones.factory.ejemplo;

import org.lpz.patrones.factory.PizzaProducto;
import org.lpz.patrones.factory.PizzeriaCaliforniaFactory;
import org.lpz.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    static void main() {

        PizzeriaZonaAbstractFactory ny = new PizzeriaCaliforniaFactory();
        PizzeriaZonaAbstractFactory cal = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = cal.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("Andres ordena una pizza: " + pizza.getNombre());

        pizza = cal.ordenarPizza("vegetariana");
        System.out.println("James ordena una pizza: " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena una pizza: " + pizza.getNombre());

        pizza = cal.ordenarPizza("peperoni");
        System.out.println("John ordena una pizza: " + pizza.getNombre());

        System.out.println("pizza: " + pizza);





    }
}
