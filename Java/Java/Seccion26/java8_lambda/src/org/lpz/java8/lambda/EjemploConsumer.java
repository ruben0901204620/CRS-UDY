package org.lpz.java8.lambda;

import org.lpz.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        // No es necesario usar parentesis para un solo parametro.
        Consumer<Date> consumidor = (fecha) ->  {
            SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + " tiene " + edad +" años.");

        consumidorBi.accept("Ruben", 24);

        // Forma simplificado de usar lambda.
        Consumer<String> consumidor2 =  System.out::println; //Consumer<String> consumidor2 = saludo -> System.out.println(saludo);

        consumidor2.accept("Hola JAVA, estoy usando lambda.");

        List<String> nombres = Arrays.asList("Ruben", "Andres", "Luz", "Paco");
        //nombres.forEach(System.out::println);
        nombres.forEach(consumidor2);

        //Supplier<Usuario> crearUsaurio = () -> new Usuario();
        Supplier<Usuario> crearUsaurio = Usuario::new;
        Usuario usaurio = crearUsaurio.get();

        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        /* BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        }; */

        asignarNombre.accept(usuario, "Armando");
        System.out.println("Nombre usuario: "+ usuario.getNombre());

        Supplier<String> proveedor = () -> {
            return "Hola mundo lambda supplier";
        };

        System.out.println(proveedor.get());


    }
}
