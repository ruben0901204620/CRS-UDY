package org.lpz.principal;

import org.lpz.modelos.*;

import java.util.Scanner;

public class FundamentosYLogicaBasica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("""
                 \t\tMenu de opciones\
                \s
                 1. Numero mayor.\
                \s
                 2. Verificar numero primo\
                \s
                 3. Contar cuantas vocales tiene una palabra ingresada.\
                \s
                 4. Calcular el factorial de un numero\
                \s
                 5. Imprimir los primeros N numeros pares.\
                \s
                 6. Salir.\
                \s
                 Ingrese una opcion 1-5:""");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:

                        NumeroMayor mayor = new NumeroMayor();

                        System.out.print("Ingrese el primer valor: ");
                        mayor.setN1(entrada.nextInt());

                        System.out.print("Ingrese el segundo valor: ");
                        mayor.setN2(entrada.nextInt());

                        System.out.print("Ingrese el tercer valor: ");
                        mayor.setN3(entrada.nextInt());

                        System.out.println("El numero mayor es: " + mayor.resultadoNumMayor());

                        main(args);
                        break;
                    case 2:
                        int numPrimo;


                        System.out.print("Ingrese un numero: ");
                        numPrimo = entrada.nextInt();

                        NumeroPrimo numeroPrimo = new NumeroPrimo(numPrimo);
                        numeroPrimo.resultadoNumPrimo();

                        main(args);
                        break;

                    case 3:
                        String palabra;
                        System.out.println("Ingrese una palabra: ");
                        NumeroDeVocales contador = new NumeroDeVocales(palabra = entrada.next());

                        contador.vocalesTotal();
                        System.out.println("la palabra '" + palabra + "' tiene " + contador.getContador() + " vocales." );

                        main(args);
                        break;

                    case 4:

                        NumeroFactorial resultadoFactorial = new NumeroFactorial();

                        System.out.print("Ingrese un numero: ");
                        resultadoFactorial.setFactorial(entrada.nextInt());
                        System.out.println("El resultado es: "+ resultadoFactorial.calcularFactorial());

                        main(args);
                        break;

                    case 5:
                        int numeroPar;

                        System.out.print("Cuantos numeros pares quiere: ");
                        numeroPar = entrada.nextInt();

                        NnumeroPares pares = new NnumeroPares(numeroPar);
                        pares.imprimirPares();

                        main(args);
                        break;

                    case 6:
                        System.out.println("Saliendo del menu...");


                        main(args);
                        break;

                    default:
                        System.out.println("¡Opcion incorrecta! \n");
                        main(args);
                        break;

                }







    }
}
