package org.lpz.ejemploGetente;

import org.lpz.compania.Cliente;
import org.lpz.compania.Empleado;
import org.lpz.compania.Persona;

import java.util.Scanner;

public class EjemploCompania {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEMP = entrada.next();
        System.out.print("Ingrese el apellido del empleado: ");
        String apellidoEMP = entrada.next();
        System.out.print("Ingrese la direccion del empleado: ");
        String direccionEMP =  entrada.next();
        System.out.print("Ingrese el numero fiscal del empleado: ");
        String numFiscalEMP = entrada.next();
        Empleado empleado = new Empleado(nombreEMP, apellidoEMP, numFiscalEMP,direccionEMP);



        System.out.println("Ingrese el porcentaje de la nueva remuneracion del empleado: ");
        int remuneracionEMP = entrada.nextInt();
        //empleado.aumentarRemuneracion(remuneracionEMP);
        Double nuevaRemuneracion = empleado.aumentarRemuneracion(remuneracionEMP);
        empleado.setRemuneracion(nuevaRemuneracion);

       // System.out.println(cliente.toString());
        System.out.println(empleado.toString());



    }
}
