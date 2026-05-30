package org.lpz.datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.Dictionary;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class EjemploDuaration2 {
    static void main() {

        Instant i1 = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();
        Duration tiempo = Duration.between(i1, i2);
        System.out.println("Tiempo: " + tiempo);

    }
}
