import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "kingston Prndrive 128GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Victus HP";
        productos[6] = "Xiaomi note 12";

        Arrays.sort(productos); // Ordena de la A-Z

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        System.out.println("=========================================");

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];

        System.out.println("prod1: " + prod1);
        System.out.println("prod2: " + prod2);
        System.out.println("prod3: " + prod3);
        System.out.println("prod4: " + prod4);
        System.out.println("prod5: " + prod5);
        System.out.println("prod6: " + prod6);

        System.out.println("=========================================");

        int[] numeros = new int[4];
        numeros[0] = 15;
        numeros[1] = 35;
        numeros[2] = 150;
        numeros[3] = -4;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        int m = numeros[numeros.length - 1];

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("m: " + m);

    }
}
