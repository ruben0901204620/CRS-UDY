package org.lpz.modelos;

public class NumeroMayor {
    private int n1;
    private int n2;
    private int n3;

    public NumeroMayor(){

    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int resultadoNumMayor() {
        int resultado;

        if( (this.n1 > this.n2) && (this.n1 > this.n3) ) {
            resultado = n1;

        } else if ( (this.n2 > this.n1) && (this.n2 > this.n3) ) {
            resultado = n2;

        } else {
            resultado = n3;
        }

        return resultado;
    }

}
