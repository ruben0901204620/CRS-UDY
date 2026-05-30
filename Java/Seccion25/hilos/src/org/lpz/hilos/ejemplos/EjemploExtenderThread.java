package org.lpz.hilos.ejemplos;

import org.lpz.hilos.ejemplos.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo1 = new NombreThread("Ruben Lopez");
        hilo1.start();
        //Thread.sleep(2);

        Thread hilo2 = new NombreThread("Maria Alejandra");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe Rodriguez");
        hilo3.start();

        System.out.println("hilo1 ->" +hilo1.getState());
        System.out.println("hilo2 ->" +hilo2.getState());
        System.out.println("hilo3 ->" +hilo3.getState());





    }
}
