package org.lpz.poointerfaces.repositorio;

import org.lpz.poointerfaces.modelo.BaseEntity;
import org.lpz.poointerfaces.repositorio.exepciones.EscrituraAccesoDatoException;
import org.lpz.poointerfaces.repositorio.exepciones.LecturaAccesoDatoException;
import org.lpz.poointerfaces.repositorio.exepciones.RegistroDuplicadoAccesoDAtoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if ( id == null || id <=0) {
            throw new LecturaAccesoDatoException("ID invalido debe ser mayor a cero.");

        }
        T resultado = null;
        for(T cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        if (resultado == null) {
            throw new LecturaAccesoDatoException("No existe registro con el id: " + id);
        }

        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException{
        if(t == null) {
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null.");
        }
        if(this.dataSource.contains(t)) {
            throw new RegistroDuplicadoAccesoDAtoException("Error el objeto con id: "
                    + t.getId() + " existe en el repocitorio." );
        }
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}
