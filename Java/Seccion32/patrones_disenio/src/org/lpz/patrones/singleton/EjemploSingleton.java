package org.lpz.patrones.singleton;

public class EjemploSingleton {
    static void main() {
        ConexionBDSingleton con = null;

        for (int i = 0; i < 10; i++)
        {
            con = ConexionBDSingleton.getInstancia();
            System.out.println("con: " + con);
        }

        ConexionBDSingleton con2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstancia();

        boolean b1 = (con == con2) && (con2 == con3) && (con == con3);
        System.out.println("b1: " + b1);



    }
}
