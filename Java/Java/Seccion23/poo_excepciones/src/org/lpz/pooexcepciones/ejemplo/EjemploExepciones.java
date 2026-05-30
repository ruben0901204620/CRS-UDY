package org.lpz.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExepciones {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un entero:");

        try {
            int divisor = Integer.parseInt(valor);
            int division = 10/divisor;
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una exepcion: Ingrese un valor numero: " + nfe.getMessage());
            main(args);
        } catch (ArithmeticException ae) { // Forma mas generica de tratar una exepcion (Exception e)
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepcion.");
        }
        System.out.println("Continuamos con al ejecucion!");




    }
}
