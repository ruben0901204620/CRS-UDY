package org.lpz.poointerfaces;

import org.lpz.poointerfaces.modelo.Cliente;
import org.lpz.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("bea", "Gonzales"));
        repo.crear(new Cliente("Luci", "martinez"));
        repo.crear(new Cliente("Andres", "Guzman"));

        List<Cliente>  clientes = repo.listar();
        clientes.forEach(c -> System.out.println(c));

        System.out.println("\n===== paginable =====\n");

        List<Cliente> paginable = repo.listar(1,3); //paginar
        paginable.forEach(c -> System.out.println(c));

        System.out.println("\n===== Ordenar =====\n");
        List<Cliente> clientesOrdenASC = repo.listar("nombre", Direccion.ASC); // paginar

        for(Cliente c: clientesOrdenASC) {
            System.out.println(c);
        }

        System.out.println("\n===== Editar =====\n");

        Cliente actualizar = new Cliente("Bea","Mena");
        actualizar.setId(2);
        repo.editar(actualizar);
        Cliente cambio = repo.porID(2);
        System.out.println(cambio);
        System.out.println("\n");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

        System.out.println("\n===== Eliminar =====\n");

       repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("\n===== total =====\n");
        System.out.println("Total Registrados: " + repo.total());

    }
}
