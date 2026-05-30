package orgh.guzman.optional.ejemplo.models.repositorio;

import orgh.guzman.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
