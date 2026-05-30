package orgh.guzman.optional.ejemplo;

import orgh.guzman.optional.ejemplo.models.Computador;
import orgh.guzman.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import orgh.guzman.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioOrElse {
    static void main() {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador defecto = new Computador("HP" , "VICTUS");
        Computador pc = repositorio.filtrar("asus rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("MacBook").orElseGet(() -> valorDefecto());

        /*pc = repositorio.filtrar("MacBook").orElseGet(() -> {
            return defecto;
        }); */
        System.out.println(pc);

    }

    public static Computador valorDefecto() {
        System.out.println("Obteniendo valor por defecto");
        return new Computador("HP" , "VICTUS");
    }

}
