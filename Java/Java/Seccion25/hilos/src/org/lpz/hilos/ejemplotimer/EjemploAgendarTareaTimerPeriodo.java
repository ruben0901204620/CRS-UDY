package org.lpz.hilos.ejemplotimer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

import java.awt.Toolkit;

import java.util.Date;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) throws InterruptedException {

        // Toolkit sirve para realizar llamadas al sistema operativo.
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // AtomicInteger sirve para crear variables compartidas entre hilos
        AtomicInteger contadorAtomic = new AtomicInteger(3);

        Timer timer = new Timer();
        int programarTiempo = 5;
        int delay = programarTiempo * 1000;

        timer.schedule(new TimerTask()  {
            // private int contador = 3;

            @Override
            public void run() {

                int i = contadorAtomic.getAndDecrement();
                if (i > 0) {
                    // .beep() es una funcion de la clase Toolkit que emite un sonido
                    toolkit.beep();
                    System.out.println("Tarea" + i + " periodica en:" + new Date()
                            + " nombre del thread: "
                            + Thread.currentThread().getName());

                    for (int j = 1; j <=10; j++) {
                        System.out.println(j + " segundos ...");

                        try {
                            Thread.sleep(1000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        };

                    }
                    i--;
                } else {
                    System.out.println("Finaliza el tiempo.");
                    timer.cancel();
                }

            }

        }, delay, 10000);

        System.out.println("Agendamos una tarea para " + programarTiempo + " segundos mas ...");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " segundos ...");
            Thread.sleep(1000);
        }

    }

}
