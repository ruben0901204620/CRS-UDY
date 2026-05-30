import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema: " + varEnv);

        String username = System.getenv("USERNAME"); //USER en linux
        System.out.println("username: " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome: " + javaHome);

        String temDir = System.getenv("TEMP ");
        System.out.println("temDir: " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path: " + path);

        String path2 = varEnv.get("Path"); // PATH en linux
        System.out.println("path: " + path2);

        String javaHome2 = System.getenv("JAVA_HOME");
        if (javaHome == null) {
            System.out.println("JAVA_HOME no está configurado");
        } else {
            System.out.println("JAVA_HOME: " + javaHome2);
        }



    }
}
