package org.lpz.recursividad.ejemplo;

import org.lpz.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    static void main(String[] args) {

        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente de poder 700w");
        Componente madre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("AMD Rizer 5 2800");
        Componente ventilador = new Componente("Ventilador cpu");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia GTX 1650 4Gb");
        Componente gpu = new Componente("Nvidia gpu GTX");
        Componente gpuRam = new Componente("4Gb RAM");
        Componente gpuRam2 = new Componente("4Gb RAM");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new  Componente("Memoria RAM 32Gb");
        Componente ssd = new Componente("Disco ssd 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);

        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);

        madre.addComponente(cpu)
                .addComponente(gpu)
                .addComponente(ram)
                .addComponente(ssd);

        pc.addComponente(poder)
                .addComponente(madre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        metodoRecursivoJava8(pc, 0).forEach(c -> System.out.println("-\t".repeat(c.getNivel()) + c.getNombre()));

    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
        c.setNivel(nivel);

        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel + 1)));

    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("-\t".repeat(nivel) + c.getNombre());

        if(c.tieneHijos()) {
            for (Componente hijo:c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }

    }

}
