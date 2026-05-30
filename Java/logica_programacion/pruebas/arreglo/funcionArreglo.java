public class funcionArreglo {
    int[] numeros;
 
    
    public funcionArreglo(int tamaño){
        this.numeros = new int[tamaño];
    }

    public void llenarArreglo(int posicion, int valor) {

        if(posicion >= 0 && posicion < numeros.length) {
            this.numeros[posicion] = valor;
        }


    }

    public int getTamaño() {
        return this.numeros.length;
    }

    public void mostrarArreglo() {

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Posición["+i+"] = " + numeros[i]);

        }
        
        System.out.println();

        for (int i : numeros) {
            System.out.println("Posición:" + 1+i);
    
        }

    }





}
