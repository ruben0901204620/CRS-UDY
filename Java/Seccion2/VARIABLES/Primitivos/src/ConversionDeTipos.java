public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt: " + numeroInt);

        var realStr = "98789.54";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble: " + realDouble);

        String logicoStr = "TRUE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean: " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt: " + otroNumeroInt);

        // Implementarlo con Integer.toString();
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr: " + otroNumeroStr);

        // Implementarlo con valueOf();
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr: " + otroNumeroStr);

        double otroRealDouble = 1.123456e2;
        String otroRealStr = Double.toHexString(otroRealDouble);
        System.out.println("otroRealStr: " + otroRealDouble);

        otroNumeroStr = String.valueOf(123.4568e7f);
        System.out.println("otroNumeroStr: " + otroNumeroStr);

        int i = 10000;

        short s = (short)i; //casting: forzar la conversion.
        System.out.println("s: " + s);

        long l = i;
        System.out.println("l: " + l);

        char c = (char)i;
        System.out.println("c: " + c);

    }
}
