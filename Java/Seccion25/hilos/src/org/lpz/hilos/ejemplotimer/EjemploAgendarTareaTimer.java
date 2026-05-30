package org.lpz.hilos.ejemplotimer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();
        int programarTiempo = 5;
        int delay = programarTiempo * 1000;

        timer.schedule(new TimerTask() {

            public void run() {
                System.out.println("Tarea realizada en:" + new Date()
                        + " nombre del thread: "
                        + Thread.currentThread().getName());

                System.out.println("Finaliza el tiempo.");
                timer.cancel();

            }

        }, delay);

        System.out.println("Agendamos una tarea para " + programarTiempo + " segundos mas ...");

        // for(int i = 1; i <=programarTiempo; i++) {
        //     System.out.println(i + " segundos ...");
        //     Thread.sleep(1000);
        // } 

    }

}
