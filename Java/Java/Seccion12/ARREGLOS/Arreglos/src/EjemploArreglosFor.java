import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int conteo = productos.length;

        productos[0] = "kingston Prndrive 128GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Victus HP";
        productos[6] = "Xiaomi note 12";

        Arrays.sort(productos);

        System.out.println("\n=== usando for ===");
        for(int i = 0; i < conteo; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println("\n=== usando foreach ===");
        for(String prod:productos) {
            System.out.println("prod: " + prod);
        }

        System.out.println("\n=== usando while ===");
        int i = 0;
        while(i < conteo) {
            System.out.println("para indice " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("\n=== usando do while ===");
        int j = 0;
        do{
            System.out.println("para indice " + j + ": " + productos[j]);
            j++;
        } while (j < conteo);

        System.out.println("\n=======================================================");

        int[] numeros = new int[10];
        int conteoNum = numeros.length;

        for(int k = 0; k < conteoNum; k++) {
            numeros[k] = k + 1;
        }

        for(int k = 0; k < conteoNum; k++) {
            System.out.println("numeros [" + k + "]: " + numeros[k]);
        }


    }
}
