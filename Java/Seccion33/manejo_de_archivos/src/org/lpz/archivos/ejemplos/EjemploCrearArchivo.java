package org.lpz.archivos.ejemplos;

import org.lpz.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    static void main() {

        String nombreArchivo = "C:\\Users\\lopez\\Desktop\\Code\\Java\\Java\\Seccion33\\archivos_guardados\\prueba1.txt";


        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);



    }
}
