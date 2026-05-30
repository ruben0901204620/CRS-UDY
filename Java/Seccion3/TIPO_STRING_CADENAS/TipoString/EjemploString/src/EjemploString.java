public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion JAVA";
        String curso2 = new String("Programacion JAVA");

        boolean esIgual = curso == curso2;
        System.out.println("es igual: " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("es igual: " + esIgual);

        String curso3 = "Programacion JAVA";
        esIgual = curso == curso3;
        System.out.println("es igual: " + esIgual);



    }
}
