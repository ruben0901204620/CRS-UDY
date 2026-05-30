package org.lpz.app.jardin;

import org.lpz.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();

    }


}
