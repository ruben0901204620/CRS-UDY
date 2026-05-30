import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese el primer nombre: ");
        String nombre1 = entrada.nextLine();
        String n1 = nombre1.toUpperCase().charAt(1) + "."  + nombre1.substring(nombre1.length()-2);

        System.out.print("ingrese el segundor nombre: ");
        String nombre2 = entrada.nextLine();
        String n2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);

        System.out.print("ingrese el tercer nombre: ");
        String nombre3 = entrada.nextLine();
        String n3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        String concatenacion = n1 + "_" + n2 + "_" + n3;
        System.out.println("\nResulado: " + concatenacion);

    }
}
