package orgh.guzman.optional.ejemplo.models.repositorio;

import orgh.guzman.optional.ejemplo.models.Computador;
import orgh.guzman.optional.ejemplo.models.Fabricante;
import orgh.guzman.optional.ejemplo.models.Procesador;

import javax.naming.CompositeName;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {
    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();

        Procesador proc = new Procesador("i9-9980H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "STRIX G512");

        dataSource.add(asus);
        dataSource.add(new Computador("MacBook Pro", "M2"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {

        return dataSource.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst();

        /*for(Computador c: dataSource) {
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
