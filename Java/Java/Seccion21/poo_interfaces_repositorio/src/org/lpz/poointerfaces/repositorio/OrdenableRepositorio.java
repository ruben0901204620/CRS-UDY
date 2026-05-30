package org.lpz.poointerfaces.repositorio;

import org.lpz.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);


}
