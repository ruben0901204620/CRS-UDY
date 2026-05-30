package logica_programacion.pruebas.concurrencia;


public class MiHilo extends Thread { 
    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Este es el metodo que se ejecuta en el hilo.
        for(int i = 1; i <=5; i++) {
            System.out.println(nombre + " ejecutando paso" + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                //System.out.println(nombre + " fue interrumpido.");
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " ha terminado...");
    }
}
