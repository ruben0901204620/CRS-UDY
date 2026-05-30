package org.lpz.modelos;

public class NumeroDeVocales {
    private final String palabra;
    private int contador = 0;

    public NumeroDeVocales(String palabra) {
        this.palabra = palabra;

    }

    public int getContador() {
        return contador;

    }

    public void vocalesTotal() {
        String palabraMinuscula = this.palabra.toLowerCase();

        for(int i = 0; i < palabraMinuscula.length(); i++) {
            char vocales = palabraMinuscula.charAt(i);
            if( (vocales == 'a') || (vocales == 'e') || (vocales == 'i')
                    || (vocales == 'o') || (vocales == 'u') ) {
                contador++;

            }

        }


    }


}
