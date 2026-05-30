package org.lpz.poointerfaces.repositorio;

import org.lpz.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente porID(Integer id);

    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);




}
