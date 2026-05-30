package org.lpz.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    static void main() {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Seg: " + ahora.getSecond());

        LocalTime seisConTreita = LocalTime.of(6, 30, 59);
        System.out.println(seisConTreita);
        seisConTreita = LocalTime.parse("06:30");

        System.out.println(seisConTreita);

        LocalTime sieteConTreita = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println(sieteConTreita);

        boolean esAnterior = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println(esAnterior);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("hh:mm:ss a");
        //String ahoraFormateado = ahora.format(dt);
        String ahoraFormateado = seisConTreita.format(dt);
        System.out.println(ahoraFormateado);

        ahoraFormateado = dt.format(ahora);
        System.out.println(ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("max: " + max);
        System.out.println("min: " + min);






    }
}
