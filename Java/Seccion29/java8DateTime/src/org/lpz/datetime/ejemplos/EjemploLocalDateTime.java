package org.lpz.datetime.ejemplos;

import javax.management.MalformedObjectNameException;
import java.time.LocalDateTime;
import  java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    static void main() {

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo: " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2026, Month.JANUARY, 22, 18, 45, 59);
        System.out.println("fechaTiempo: " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2026-01-22T18:45:59");
        System.out.println(fechaTiempo);

        fechaTiempo = fechaTiempo.plusDays(1).plusHours(3).minusSeconds(2);
        System.out.println(fechaTiempo);

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes: " + mes);

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia: " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio: " + anio);

        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formato1: "+ formato1);

        String formato2 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss a"));
        System.out.println("Formato2: " + formato2);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss a");

        String formato3 = df.format(fechaTiempo);
        System.out.println("Formato3: " + formato3);



    }

}
