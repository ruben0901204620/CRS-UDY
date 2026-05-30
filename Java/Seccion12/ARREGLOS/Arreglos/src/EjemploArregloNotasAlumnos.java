import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] claseMatematicas, clasehistoria, claseLenguaje;
        claseMatematicas = new double[7];
        clasehistoria = new  double[7];
        claseLenguaje = new  double[7];

        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        System.out.println("Ingrese 7 notas de estudiantes para matematicas:");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = entrada.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia:");
        for (int i = 0; i < clasehistoria.length; i++) {
            clasehistoria[i] = entrada.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = entrada.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += clasehistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/clasehistoria.length;
        double promedioLenguaje = sumNotasLenguaje/claseLenguaje.length;

        System.out.println("Promedio clase matematicas: " + promedioMatematicas );
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.printf("Promedio clase lenguaje: "+ promedioLenguaje);

        System.out.println("\npromedio total del curso: " + (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("Ingrese el identificador del alumno (de 0 - 6): ");
        int id = entrada.nextInt();
        double primedioAlumno = (clasehistoria[id] + claseMatematicas[id] + claseLenguaje[id]);
        System.out.printf("promedio alumno Nro: " + id + " : " + primedioAlumno);



    }
}
