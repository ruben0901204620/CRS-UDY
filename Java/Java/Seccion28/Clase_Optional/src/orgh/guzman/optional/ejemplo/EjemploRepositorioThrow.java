package orgh.guzman.optional.ejemplo;

import orgh.guzman.optional.ejemplo.models.Computador;
import orgh.guzman.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import orgh.guzman.optional.ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioThrow {
    static void main() {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP" , "VICTUS");

        Computador pc = repositorio.filtrar("asus rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();

        System.out.println(extension);


    }


}
