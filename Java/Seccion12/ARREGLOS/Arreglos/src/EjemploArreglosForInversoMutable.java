import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

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

    public static void main(String[] args) {

        String[] productos = {"kingston Prndrive 128GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Victus HP", "Xiaomi note 12"};

        int conteo = productos.length;

        Arrays.sort(productos);

        System.out.println("\n=== usando for ===");
        for(int i = 0; i < conteo; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println("\n=== usando for inverso ===");
        arregloInverso(productos);

        // Collections.reverse(Arrays.asList(productos));
        for(int i = 0; i < conteo; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

    }
}
