import java.util.Locale;

public class ValidarString {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        if(esNulo) {
            curso = "Programacion JAVA";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco " + esBlanco);

        if(!esVacio) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al cuso " + curso);

        }


    }
}
