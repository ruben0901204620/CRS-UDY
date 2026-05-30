package org.lpz.ejemplo;

import org.lpz.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("========= Creando la instancia de la clase Alumno =========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Ruben");
        alumno.setApellido("Lopez");
        alumno.setInstituto("Instituto nacional"); // cast Alumno()
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("========= Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("matematicas");

        System.out.println("========= -- =========");
        System.out.println("========= Creando la instancia de la clase AlumnoInternacional =========");
        AlumnoInternacional alumnoIn = new AlumnoInternacional();
        alumnoIn.setNombre("Peter");
        alumnoIn.setApellido("Veliz");
        alumnoIn.setPais("Australia");
        alumnoIn.setEdad(20);
        alumnoIn.setInstituto("Intituto nacional");
        alumnoIn.setNotaIdiomas(6.8);
        alumnoIn.setNotaLenguaje(6.2);
        alumnoIn.setNotaHistoria(5.8);
        alumnoIn.setNotaMatematica(6.5);

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstituto());

        System.out.print("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        System.out.println(alumnoIn.getNombre()
        + " " + alumnoIn.getApellido()
        + " " + alumnoIn.getPais());

        Class clase = alumnoIn.getClass();

        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre: " + padre);
            clase = clase.getSuperclass();
        }

    }
}
