package org.lpz.app.jardin;

import org.lpz.app.hogar.*;
import static org.lpz.app.hogar.Persona.saludar;
//import org.lpz.app.hogar.Persona;
//import org.lpz.app.hogar.Gato;


public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona(); // org.lpz.app.hogar.Persona p = new org.lpz.app.hogar.Persona();
        p.setNombre("Ruben");
        System.out.println(p.getNombre());


        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando: " + jugando);
        String saludo = new saludar();


    }
}
