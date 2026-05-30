package org.lpz.ejemplo;

import org.lpz.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos en comun del tipo Persona.");
        System.out.println("Nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if(persona instanceof Alumno) {
            System.out.println("Imprimeindo los datos del tipo Alumno.");
            System.out.println("Instituto: " + ((Alumno) persona).getInstituto());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Lenguaje: " + ((Alumno) persona).getNotaLenguaje());

            if(persona instanceof AlumnoInternacional) {
                System.out.println("Imprimeindo los datos del tipo AlumnoInternacional.");
                System.out.println("Nota Idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
                System.out.println( ( (AlumnoInternacional) persona).getPais());
            }

            System.out.println("================= sobre escritura promedio ====================");
            System.out.println(((Alumno) persona).calcularPromedio());

        }

        if(persona instanceof Profesor) {
            System.out.println("Imprimeindo los datos del tipo profesor.");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("================= sobre escritura saludar ====================");
        System.out.println(persona.saludar());
        System.out.println("================== sobre escritura saludar ===================");
    }

}