package org.lpz.archivos.ejemplos;

import org.lpz.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    static void main() {

        String nombreArchivo = "C:\\Users\\lopez\\Desktop\\Code\\Java\\Java\\Seccion33\\archivos_guardados\\prueba1.txt";

        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo2(nombreArchivo));



    }
}
