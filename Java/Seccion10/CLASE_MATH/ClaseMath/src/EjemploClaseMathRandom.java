import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String colores[] = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double aleatorio = Math.random();
        aleatorio *= colores.length;
        System.out.println("Colores: " + colores[(int) aleatorio]);
        System.out.println("Aleatorio: " + aleatorio);

        aleatorio *= 7;
        System.out.println("Aleatorio: " + aleatorio);

        aleatorio = Math.floor(aleatorio);
        System.out.println("Aleatorio: " + aleatorio);

        Random randomobj = new Random();
        int randomInt = 15 +randomobj.nextInt(25+1 - 15);
        System.out.println("RandomINt: " + randomInt);

        randomInt = randomobj.nextInt(colores.length);
        System.out.println("randomInt: " + randomInt);
        System.out.println("colores: " + colores[randomInt]);

    }
}
