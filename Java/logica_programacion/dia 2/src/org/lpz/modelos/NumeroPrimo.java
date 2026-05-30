package org.lpz.modelos;

public class NumeroPrimo {
    private final int numero;

    public NumeroPrimo(int numero) {
        this.numero = numero;

    }

    public void resultadoNumPrimo() {
        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;

        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

        }

        if (esPrimo) {
            System.out.println("El numero " + numero + " es primo.");
        } else {
            System.out.println("El numero " + numero + " no es primo.");

        }

    }
}
