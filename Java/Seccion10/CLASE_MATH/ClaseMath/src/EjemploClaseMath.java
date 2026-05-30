public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto: " + absoluto);

        absoluto = Math.abs(-3);
        System.out.println("absoluto: " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("VAlor maxima: " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Varlo minimo: " + min);

        double techo = Math.ceil(3.5);
        System.out.println("Techo: " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso: " + piso);

        long entero = Math.round(3.5);
        System.out.println("Entero: " + entero);

        entero = Math.round(Math.PI);
        System.out.println("Entero: " + entero);

        double exp = Math.exp(2);
        System.out.println("exp: " + exp);

        double log = Math.log(10);
        System.out.println("log: " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("Potencia: " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("Raiz: " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados: " + grados);

        double radianes = Math.toRadians(1.57);
        System.out.println("Convertit de grados a radianes: " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("Cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
