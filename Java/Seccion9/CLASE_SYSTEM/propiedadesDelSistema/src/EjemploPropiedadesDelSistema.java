import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("Username: " + username);

        String home = System.getProperty("user.home");
        System.out.println("HOME: " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("WORKSPACE: " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("JAVA: " + java);

        String lineaSeparator = System.getProperty("line.separator");
        String lineaSeparator2 = System.lineSeparator();
        System.out.println("lineaSeparator: " + lineaSeparator);
        System.out.println("lineaSeparator" + lineaSeparator2 + "Una linea nueva...");

        Properties p = System.getProperties();
        p.list(System.out);

    }
}
