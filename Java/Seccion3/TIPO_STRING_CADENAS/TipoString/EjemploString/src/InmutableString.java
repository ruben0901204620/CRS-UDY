public class InmutableString {
    public static void main(String[] args) {
        String curso = "Programacion JAVA";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("Curso: " + curso);
        System.out.println("Resultado: " + resultado);

        String resultado2 = curso.transform(asignatura -> {
            return asignatura + " con " + profesor;
        });

        System.out.println("curso: " + curso);
        System.out.println("resultado2: " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3: " + resultado3);

    }
}
