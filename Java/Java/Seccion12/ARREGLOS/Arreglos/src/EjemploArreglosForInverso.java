import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        // String[] productos = new String[7];
        String[] productos = {"kingston Prndrive 128GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MacBook Air", "Victus HP", "Xiaomi note 12"};

        int conteo = productos.length;

        /*productos[0] = "kingston Prndrive 128GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Victus HP";
        productos[6] = "Xiaomi note 12";*/

        Arrays.sort(productos);

        System.out.println("\n=== usando for ===");
        for(int i = 0; i < conteo; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println("\n=== usando for inverso ===");
        for(int i = 0; i < conteo; i++) {
            System.out.println("para i [" + (conteo-1-i) + "] valor: " + productos[conteo-1-i]);
        }

        System.out.println("\n=== usando for inverso 2===");
        for( int i = conteo - 1; i >= 0; i--) {
            System.out.println("para i [" + i + "] valor: " + productos[i]);

        }

    }
}
