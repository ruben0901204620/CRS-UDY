package org.lpz.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    static void main() {

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("Lapsus: " + lapsus);
        System.out.println(lapsus.getSeconds());
        System.out.println(lapsus.toHours());
        System.out.println("Sumamos 5 horas: " + lapsus.plusHours(5));




    }
}
