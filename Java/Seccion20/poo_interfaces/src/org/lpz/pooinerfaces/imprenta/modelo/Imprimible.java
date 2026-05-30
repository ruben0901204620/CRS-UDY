package org.lpz.pooinerfaces.imprenta.modelo;

public interface Imprimible {

    /* Por defecto un atributo sera static final */
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto.";

     default String imprimir() {

        return TEXTO_DEFECTO ;
     }

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());

    }

     

}
