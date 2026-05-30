package orgh.guzman.optional.ejemplo;

import orgh.guzman.optional.ejemplo.models.Computador;
import orgh.guzman.optional.ejemplo.models.Fabricante;
import orgh.guzman.optional.ejemplo.models.Procesador;
import orgh.guzman.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import orgh.guzman.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    static void main() {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus rog")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "Intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido.");

        System.out.println(f);


    }



}
