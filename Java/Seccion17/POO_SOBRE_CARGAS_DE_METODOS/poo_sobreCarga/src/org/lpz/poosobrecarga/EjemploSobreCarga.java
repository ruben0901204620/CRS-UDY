package org.lpz.poosobrecarga;

import static org.lpz.poosobrecarga.Calculadora.*;

public class EjemploSobreCarga {
    public static void main(String[] args) {


        System.out.println("Sumar int: " + sumar(10, 5));
        System.out.println("Sumar float: " + sumar(10.0F, 5f));
        System.out.println("Sumar float-int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0F));
        System.out.println("Sumar double: " + sumar(10d, 5d));
        System.out.println("Sumar string: " + sumar("10", "5"));
        System.out.println("Sumar tres int: " + sumar(10, 5, 3));
        System.out.println("Sumar seis int: " + sumar(10, 5, 3, 4, 6, 7));
        System.out.println("Sumar float + n int:" + sumar(10.0f, 5, 5, 9, 15));
        System.out.println("Sumar tres double: :" + sumar(1.0, 5.0, 3.5, 4.5));

        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar float-int: " + sumar(10,'@'));

    }
}
