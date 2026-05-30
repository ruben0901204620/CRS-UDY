import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = "2000-09-27"; //scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df);

        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();
        System.out.println(actual);

        // creamos un patron de fecha numérico con el año mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));
        System.out.println(desde);
        System.out.println(hasta);

        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println(edad);
        System.out.println("La edad es: " + edad);

    }
}
