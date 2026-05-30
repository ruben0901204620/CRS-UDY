package org.lpz.java8.lambda;

import org.lpz.java8.lambda.aritmetica.Aritmetica;
import org.lpz.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        //Aritmetica suma = (a, b) -> a + b;
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a -b;

        Calculadora cal = new Calculadora();
        System.out.println("Suma: " + cal.computar(10, 5, suma));
        System.out.println("Resta: " + cal.computar(10, 3, resta));
        System.out.println("Multiplicar: " + cal.computar(10, 5, (a, b) -> a*b));

        System.out.println("Suma con BiFunction: " + cal.computarConBiFunction( 10, 5, (a, b) -> a+b));


    }
}
