import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "ruben";
        passwords[0] = "12345";

        usernames[1] = "root";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"ruben","pepe","root"};
        String passwords[] = {"12345","12345","12345"};

        System.out.print("Ingrese el username: ");
        String u = entrada.nextLine();

        System.out.print("Ingrese el password: ");
        String p = entrada.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++) {
            esAutenticado = ( (usernames[i].equals(u)) && (passwords[i].equals(p)) ) ? true: esAutenticado;
            /*if(  (usernames[i].equals(u)) && (passwords[i].equals(p)) ) {
                esAutenticado = true;
                break;"Bienvenido usuario ¡".concat(u).concat("!")
            }*/

        }

        String mensaje = esAutenticado ? "Bienvenido usuario ¡".concat(u).concat("!") :
                "Username o password incorrecto.\n Lo siento, requiere autentificacion";

        System.out.println("mensaje: " + mensaje);

        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario ¡".concat(u).concat("!"));
        } else {
            System.out.println("Username o password incorrecto.");
            System.out.println("Lo siento, requiere autentificacion");
        }*/

    }
}
