import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] a = new String[4];

        for(int i = 0; i < a.length; i++) {
            System.out.print("ingrese un nombre: ");
            a[i] = entrada.next();
        }

        System.out.print("\r\ningrese un nombre a buscar: ");
        String nombre = entrada.next();

        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)) {
            i++;
        }

        if(i == a.length) {
            System.out.println("Nombre no encontrado.");
        } else if ( a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("nombre encontrado en la posicion: " + i);
        }

    }
}
