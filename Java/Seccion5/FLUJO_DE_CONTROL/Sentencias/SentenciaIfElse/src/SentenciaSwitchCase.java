import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 1-12: ");
        int mes = entrada.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case  5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8 :
                nombreMes = "Agosto";
                break;
            case 9 :
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Indefinido...");

        }
        System.out.println("Nombre del mes: " + nombreMes);

        byte num = '2';

        switch (num) {
            case '0':
                System.out.println("El numero es cero.");
                break;
            case '1':
                System.out.println("El numero es uno.");
                break;
            case '2':
                System.out.println("El numero es dos.");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("El caracter es a.");
                break;
            default:
                System.out.println("numero o caracter desconocido.");
        }

        String nombre = "Ruben";

        switch (nombre) {
            case "admin":
                System.out.println("Hola 'admin', bienvenido. ");
                break;
            case "root":
                System.out.println("Hola 'root', bienvenido.");
            case "Ruben":
                System.out.println("Hola 'Ruben', bienvenido. ");
                break;
            default:
                System.out.println("Usuario desconocido.");
        }

    }
}
