package org.lpz.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService ejecutor = Executors.newSingleThreadExecutor();
        
        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea ...");

            return "Algun resultado importante de la tarea";
        };

        Future<String> resultado = ejecutor.submit(tarea);
        ejecutor.shutdown();
        System.out.println("Continuando con la ejecucaion del main");

        //System.out.println(resultado.isDone());
        while(!resultado.isDone()) {
            System.out.println("Ejecutando tarea ...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }

        System.out.println("Obtenemos resultado de la terea: " + resultado.get(5, TimeUnit.SECONDS));
        System.out.println("Finaliza la tarea: " + resultado.isDone());



    }
}
