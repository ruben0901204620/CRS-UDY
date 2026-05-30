package org.lpz.modelos;

public class NumeroFactorial {
    private int factorial;

    public NumeroFactorial() {

    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }

    public int calcularFactorial() {
        int resultado = 1;

        for(int i = this.factorial; i >= 1; i--) {
            resultado *= i;
        }

        return resultado;
    }

}
