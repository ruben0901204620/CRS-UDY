package org.lpz;

import org.lpz.poointerfaces.modelo.Cliente;
import org.lpz.poointerfaces.repositorio.exepciones.AccesoDatoException;
import org.lpz.poointerfaces.repositorio.exepciones.EscrituraAccesoDatoException;
import org.lpz.poointerfaces.repositorio.exepciones.LecturaAccesoDatoException;
import org.lpz.poointerfaces.repositorio.exepciones.RegistroDuplicadoAccesoDAtoException;
import org.lpz.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.lpz.poointerfaces.repositorio.Direccion;
import org.lpz.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzales"));
            repo.crear(new Cliente("Luci", "Martinez"));
            Cliente andres = new Cliente("Andres", "Guzman");
            repo.crear(andres);
            //repo.crear(andres);

           //repo.crear(null);
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Cliente> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Cliente> clienteOrdenASC = repo.listar("apellido", Direccion.ASC);
            for(Cliente c: clienteOrdenASC) {
                System.out.println(c);
            }

            System.out.println("===== editar =====");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(2);
            System.out.println(bea);
            System.out.println("===============");
            repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

            System.out.println("===== eliminar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println("===== total =====");
            System.out.println("Total registros: " + repo.total());

        } catch (RegistroDuplicadoAccesoDAtoException e) {
            System.out.println("Registro duplicado: " + e.getMessage());
            e.printStackTrace();

        }
        catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();

        } catch (AccesoDatoException e) {
            System.out.println("Generica: " +e.getMessage());
            e.printStackTrace();
        }

    }
}
