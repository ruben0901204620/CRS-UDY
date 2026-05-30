package org.lpz.ejemplos.list;

import org.lpz.ejemplos.modelo.Alumno;
import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        
        List<Alumno> al = new ArrayList<>(); 

        System.out.println(al + ", size: " + al.size());
        System.out.println("Esta vacia: " + al.isEmpty());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luciano", 4));
        al.add(2,new Alumno("Jano", 7)); // desplaza el elemento
        al.set(3,new Alumno("Andres", 3)); // modificando el indice
        al.add(new Alumno("Zeus", 2));
        al.add(new Alumno("Zeus", 2));

        System.out.println(al + ", size: " + al.size());
        //al.remove(new Alumno("Jano", 7)); // borra el elemento
        
        al.remove(2); // borra el indice


        System.out.println(al + ", size: " + al.size());
        
        boolean b = al.contains(new Alumno("Zeus", 2));
        System.out.println("La lsita contiene Zeus? " + b);

        // Convertir un List a un arreglo.
        Object[] a = al.toArray();

        for(int i = 0; i <a.length; i++) {
            System.out.println("Desde el arreglo: " + a[i]);
        }


    }
    
}
