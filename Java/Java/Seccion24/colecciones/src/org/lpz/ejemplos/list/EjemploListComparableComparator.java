package org.lpz.ejemplos.list;

import org.lpz.ejemplos.modelo.Alumno;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        
        List<Alumno> sa = new ArrayList<>(); 
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luciano", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        System.out.println(sa);

        // Diferentes formas de ordenar
        //Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        //sa.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed()); // forma simple

        System.out.println("Iterando usando un forEach");
        sa.forEach(System.out::println);


    }
    
}
