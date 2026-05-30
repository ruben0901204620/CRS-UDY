package org.lpz.modelos;

public class NnumeroPares {
    private final int numero;

    public NnumeroPares(int numero) {
        this.numero = numero;

    }

    public void imprimirPares() {
        int contador=0;
        int i;

        for(i = 1; contador < this.numero; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
                contador++;

            }

        }

    }

}
