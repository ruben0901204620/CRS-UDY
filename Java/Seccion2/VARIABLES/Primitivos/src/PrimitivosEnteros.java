public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("Numero Byte:"+numeroByte);
        System.out.println("Tipo Byte corresponde en byte: " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en bites: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        System.out.println("\n");

        short numeroShort = 32767;
        System.out.println("Numero short:"+numeroShort);
        System.out.println("Tipo short corresponde en byte: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites: " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        System.out.println("\n");

        int numeroInt = 2147483647;
        System.out.println("Numero int:"+numeroInt);
        System.out.println("Tipo int corresponde en byte: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites: " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        System.out.println("\n");

        long numerolong = 9223372036854775807L;
        System.out.println("Numero long:"+numerolong);
        System.out.println("Tipo long corresponde en byte: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites: " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        System.out.println("\n");

        // Un dato int por defecto.
        var numeroVar = 127;



    }
}
