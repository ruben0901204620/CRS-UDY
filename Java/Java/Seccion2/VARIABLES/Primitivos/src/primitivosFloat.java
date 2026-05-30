public class primitivosFloat {
    public static void main(String[] args) {
        //mantiza se le conoce el 1.5
        //valor de punto fijo a 0.000000000015
        float numeroFloat = 1.5E4f;//150000f;
        float numeroFloat2 = 15.E-10f;//0.000000000015f;
        System.out.println(numeroFloat);
        System.out.println(numeroFloat2);

        System.out.println("\n");

        float numeroFloat3 = 3.4028235E38f;
        System.out.println("numero float: " + numeroFloat3);
        System.out.println("float corresponde en byte: " + Float.BYTES);
        System.out.println("float corresponde en bites: " + Float.SIZE);
        System.out.println("Maxio valor para float: " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float: " + Float.MIN_VALUE);

        System.out.println("\n");

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numero double: " + numeroDouble);
        System.out.println("float corresponde en byte: " + Double.BYTES);
        System.out.println("float corresponde en bites: " + Double.SIZE);
        System.out.println("Maxio valor para double: " + Double.MAX_VALUE);
        System.out.println("Minimo valor para double: " + Double.MIN_VALUE);

        // Tipo de dato Double por defecto.
    }
}
