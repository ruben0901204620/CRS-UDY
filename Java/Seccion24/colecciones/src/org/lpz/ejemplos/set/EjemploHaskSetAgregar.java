package org.lpz.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHaskSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("cero")); // True si se agrega de forma correcta.
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        // No almacena repetidos.
        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados? " + b);
        System.out.print(hs);








    }
}
