package org.lpz.java8.lambda;

import org.lpz.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        // Predicate devuelve boolean
        Predicate<Integer> test = num -> num > 10;
        boolean result = test.test(7);
        System.out.println("Rerultado: " + result);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("test2: " + test2.test("ROLE_ADMIN"));

        //BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
        BiPredicate<String, String> test3 = String::equals;
        System.out.println("test3: " + test3.test("andres", "andres"));

        BiPredicate<Integer, Integer> test4 = (i, j) -> i > j;
        System.out.println("test4: " + test4.test(6, 4 ));

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("Ruben");
        a.setNombre("Armando");

        BiPredicate<Usuario, Usuario> test5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        //BiPredicate<Usuario, Usuario> test5 = Usuario::equals;

        System.out.println("test5: " + test5.test(a, b));

    }
}
