public class EjemploArreglosForOrdenamientoBurbuja {

    public static  void arregloInverso(String[] arreglo) {
        int conteo = arreglo.length;
        int conteo2 = arreglo.length / 2;
        for (int i = 0; i < conteo2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[conteo-1-i];
            arreglo[i] = inverso;
            arreglo[conteo-1-i] = actual;

        }
    }


    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;

        for(int i = 0; i < total-1; i++) {
            for (int j = 0; j < total-1-i; j++) {
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0 ) {
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador: " + contador);
    }

    public static void main(String[] args) {

        String[] productos = {"kingston Prndrive 128GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Victus HP", "Xiaomi note 12"};

        int conteoproductos = productos.length;

        System.out.println("\n=== usando for PRODUCTOS ALGORITMO BURBUJA ===");

        sortBurbuja(productos);

        for(int i = 0; i < conteoproductos; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println("\n=== usando for inverso ===");

        arregloInverso(productos);

        for(int i = 0; i < conteoproductos; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println("\n=== usando for NUMEROS ALGORITMO BURBUJA ===");

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;
        int conteoNum = numeros.length;

        sortBurbuja(numeros);

        for (int i= 0; i < conteoNum; i++) {
            System.out.println("numeros [" + i + "]: " + numeros[i]);
        }

    }
}
