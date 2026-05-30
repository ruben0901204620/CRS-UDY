public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;
        System.out.println("Dato logico: " + datoLogico);

        double d = 98765e-3; // 98.76543
        float f = 12345e2f; // 123.45

        System.out.println("d: " + d);
        System.out.println("f: " + f);

        datoLogico = d > f;
        System.out.println("Dato Logico: " + datoLogico);

        boolean esIgual = (3-2) == 1;
        System.out.println(esIgual);

    }
}
