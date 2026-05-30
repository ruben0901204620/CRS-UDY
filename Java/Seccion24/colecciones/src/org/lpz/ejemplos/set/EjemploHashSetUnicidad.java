package org.lpz.ejemplos.set;

import java.util.Set;
import java.util.HashSet;
import org.lpz.ejemplos.modelo.Alumno;
import java.util.Iterator;
//mport java.util.ArrayList;
//import java.util.List;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        
        // Un TreeSet es un Set ordenado y una clase debe (Alumno)
        //implementar la interfaz Comparable
        Set<Alumno> sa = new HashSet<>(); 
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luciano", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        System.out.println(sa);


        // **** Tambien se puede iterar con TreeSet, ArrayList ****

        System.out.println("Iterando usando un forEach");
        for(Alumno a: sa) {
            System.out.println(a);
        }

        System.out.println("\nIterando usando un while y iterator");
        Iterator<Alumno> it = sa.iterator();

        while(it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        
        System.out.println("\nIterando usando Stream forEach");
        sa.forEach(System.out::println);
        //sa.forEach(a -> System.out.println(a.getNombre()));

        // Utilizando un for clasico (solo funciona con ArrayList)
        /*for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/


    }
    
}
