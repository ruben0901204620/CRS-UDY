package org.lpz.hilos.ejemplos.thread;

public class NombreThread extends Thread {

    public NombreThread(String name) {
        super(name);
    }


    // Empieza el hilo
    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo: " + getName());

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            System.out.println(this.getName());
        }

        System.out.println("Finaliza el hilo.");
    }

}
