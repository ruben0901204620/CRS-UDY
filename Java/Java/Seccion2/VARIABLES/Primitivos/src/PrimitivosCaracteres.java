public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0052';//mapa de caracteres equivale a R;
        char decimal = 64;
        System.out.println("Caracter :" + caracter);
        System.out.println("Decimal : " + decimal);

        // Caracteres especiales.
        char espacio = ' '; // Unicode del espacio "\u0028"
        char retroceso = '\b';
        char tabulador = '\t';

        /*
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.getProperty("line.separator")
        System.lineSeparator()
        */

        System.out.println("char corresponde en byte:"+ espacio + Character.BYTES);
        System.out.println("char corresponde" + tabulador + "en bites:   " + retroceso + retroceso + Character.SIZE);
        System.out.println("char valor maximo: "+ Character.MAX_VALUE);
        System.out.println("char valor minimo: " + Character.MIN_VALUE);


    }
}
