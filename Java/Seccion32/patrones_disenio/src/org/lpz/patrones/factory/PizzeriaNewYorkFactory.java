package org.lpz.patrones.factory;

import org.lpz.patrones.factory.producto.PizzaNewYorkPeperoni;
import org.lpz.patrones.factory.producto.PizzaNewYorkVegetariana;
import org.lpz.patrones.factory.producto.PizzanewYorkItaliana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    PizzaProducto producto = null;


    @Override
    PizzaProducto crearPizza(String tipo) {
        switch (tipo) {
            case "vegetariana" -> producto = new PizzaNewYorkVegetariana();
            case "peperoni" -> producto = new PizzaNewYorkPeperoni();
            case "italiana" -> producto = new PizzanewYorkItaliana();
        }
        return producto;
    }
}
