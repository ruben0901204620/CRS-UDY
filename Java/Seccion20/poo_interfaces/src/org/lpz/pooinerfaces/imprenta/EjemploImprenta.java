package org.lpz.pooinerfaces.imprenta;

import org.lpz.pooinerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("Jhon", "Doe"),
                "Ingeniero en Sistemas", "Resume larobal ...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseño: Elem. Reusable POO",
                Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patron SIngleton"))
                .addPagina(new Pagina("patron Observardor"))
                .addPagina(new Pagina(("Patron Factory")))
                .addPagina(new Pagina("Patron Compositer"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("martin", "Fowler"),
                new Persona( "james", "Gosling"),
                "Estudio sobre microservicios" );

        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

}
