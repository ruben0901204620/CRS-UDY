package org.lpz.archivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);

        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            //FileWriter escribir = new FileWriter(archivo, true);
            //BufferedWriter buffer = new BufferedWriter(escribir);

            //escribir.append("Este es un archivo de pruebas1.").append("\nArchivo creado en Windows.");
            //escribir.close();

            buffer.append("Este es un archivo de pruebas1.").append("\nArchivo creado en Windows.");
            //buffer.close();


            System.out.println("El archivo se a creado con exito!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);

        try(PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {

            buffer.println("Este es un archivo de pruebas1.");
            buffer.println("\nArchivo creado en Windows.");
            buffer.printf("Hasta luego...");

            System.out.println("El archivo se a creado con exito!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public String leerArchivo(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String linea;

            while ( (linea = leer.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            leer.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try(Scanner s = new Scanner(archivo);) {
            s.useDelimiter("\n");

            while (s.hasNext()) {
                sb.append(s.next()).append("\n");
            }

            //s.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

}
