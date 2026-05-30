import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemplOJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyy-MM-dd");

        System.out.print("Ingrese una fecha con formato 'yyyy-MM-dd': ");
        try {
            Date fecha = formato.parse(entrada.next());
            System.out.println("fecha: " + fecha);
            System.out.println("formato: " + formato.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2: " + fecha2);
            if(fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es despues que la fecha2.");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es anterior que fecha2.");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha del usuario es igual a fecha2.");

            }

            if(fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es despues que la fecha2.");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es anterior que fecha2.");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha del usuario es igual a fecha2.");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
