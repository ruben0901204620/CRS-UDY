package org.lpz.ejemplo;

import org.lpz.pooherencia.*;

public class EjemploHerenciaTostring {
    public static void main(String[] args) {

        System.out.println("========= Creando la instancia de la clase Alumno =========");
        Alumno alumno = new Alumno("Ruben", "Lopez", 24, "Instituto nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("ruben@gmail.com");

        imprimir(alumno);

        System.out.println("========= Creando la instancia de la clase AlumnoInternacional =========");
        AlumnoInternacional alumnoIn = new AlumnoInternacional("Peter", "Veliz", "Australia");
        alumnoIn.setEdad(20);
        alumnoIn.setInstituto("Intituto nacional");
        alumnoIn.setNotaIdiomas(6.8);
        alumnoIn.setNotaLenguaje(6.2);
        alumnoIn.setNotaHistoria(5.8);
        alumnoIn.setNotaMatematica(6.5);
        alumnoIn.setEmail("peter@gmail.com");

        imprimir(alumnoIn);

        System.out.println("========= Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor("Luci", "Perez", "matematicas");
        profesor.setEdad(43);
        profesor.setEmail("luci@mail.edu.gt");

        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("==========================================\n");
        System.out.println(persona);
    }

}