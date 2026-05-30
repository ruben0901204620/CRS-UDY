package logica_programacion.pruebas.concurrencia;

public class EjemploConcurrencia {
    public static void main(String[] args) {

        // Crear 3 hilos.
        MiHilo h1 = new MiHilo("Hilo A");
        MiHilo h2 = new MiHilo("Hilo B");
        MiHilo h3 = new MiHilo("Hilo C");
        
        // Iniciar los hilos.
        h1.start();
        h2.start();
        h3.start();
        
        System.out.println("Hilos iniciados desde el main.");

        Runnable tarea1 = new MiTarea("Tarea A");
        Runnable tarea2 = new MiTarea("Tarea B");
        Runnable tarea3 = new MiTarea("Tarea C");

        // Asociamos cada tarea a un hilo
        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);
        Thread hilo3 = new Thread(tarea3);
        
        hilo1.start();
        hilo2.start();        
        hilo3.start();

        System.out.println("Tareas iniciadas desde el main.");


    }
    
}
