package org.lpz.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTime {
    static void main() {

        //LocalDateTime fechaLocal = LocalDateTime.now();
        LocalDateTime fechaLocal = LocalDateTime.parse("2026/09/23 12:45",
                DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm"));

        ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNY = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNY = fechaLocal.atZone(newYork);
        //System.out.println("Zona horaria de New York: " + zonaNY);
        System.out.println("Hora de partida de New York: " + zonaNY);


        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNY.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        //System.out.println("Zona horaria de Madrid: " + zonaMadrid);
        System.out.println("Hora de llegada de Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HHmm, dd, MMM yyyy");
        System.out.println("Detalles del viaje a España: ");
        System.out.println("Partida NY: " + f.format(zonaNY));
        System.out.println("Llegada a Madrid: " + f.format(zonaMadrid));

        Set<String> zonas = ZoneId.getAvailableZoneIds();
        zonas.forEach(System.out::println);






    }
}
