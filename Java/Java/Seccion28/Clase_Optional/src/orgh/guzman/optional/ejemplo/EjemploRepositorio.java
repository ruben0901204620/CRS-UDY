package orgh.guzman.optional.ejemplo;

import orgh.guzman.optional.ejemplo.models.Computador;
import orgh.guzman.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import orgh.guzman.optional.ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    static void main() {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontro"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontro.");
        } */




    }
}
