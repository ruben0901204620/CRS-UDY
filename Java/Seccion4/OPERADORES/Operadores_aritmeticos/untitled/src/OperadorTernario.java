import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String variable = 8 == 7 ? "Si es verdadero": "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 5.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.print("Ingrese la nota de matematicas entre 2.0-7.0: ");
        matematicas = entrada.nextDouble();

        System.out.print("Ingrese la nota de ciencias entre 2.0-7.0: ");
        ciencias = entrada.nextDouble();

        System.out.print("Ingrese la nota de historia entre 2.0-7.0: ");
        historia = entrada.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

    }
}
