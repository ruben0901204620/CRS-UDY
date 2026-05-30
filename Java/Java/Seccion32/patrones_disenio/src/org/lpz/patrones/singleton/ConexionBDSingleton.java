package org.lpz.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;



    private ConexionBDSingleton() {
        System.out.println("Conectandose algun motor de base de datos.");

    }

    public static ConexionBDSingleton getInstancia() {

        if(!(instancia instanceof ConexionBDSingleton) ) {
            instancia = new ConexionBDSingleton();
        }

        return instancia;
    }

}
