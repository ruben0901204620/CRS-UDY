package org.lpz.poointerfaces.repositorio.exepciones;

import java.util.concurrent.ExecutionException;

public class AccesoDatoException extends ExecutionException {

    public AccesoDatoException(String message) {
        super(message);
    }

}
