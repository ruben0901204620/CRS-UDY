package org.lpz.anotaciones.ejemplo;

import org.lpz.anotaciones.ejemplo.models.Producto;
import org.lpz.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;


public class EjemploAnotacion {
    static void main() {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de centro ROBLE");
        p.setPrecio(1000l);
        System.out.println("json = " + JsonSerializador.convertirJson(p));


    }
}
