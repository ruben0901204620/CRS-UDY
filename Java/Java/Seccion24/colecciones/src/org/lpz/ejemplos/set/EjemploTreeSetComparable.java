package org.lpz.ejemplos.set;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;
import org.lpz.ejemplos.modelo.Alumno;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        
        // Un TreeSet es un Set ordenado y una clase debe (Alumno)
        //implementar la interfaz Comparable
        //Set<Alumno> sa = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNombre).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luciano", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);


    }
    
}
