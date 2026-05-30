package E01;

import java.util.Scanner;
//import java.util.List;
/*import java.util.ArrayList;
import java.util.Iterator;*/


/*
 * Objetivo: Practicar ArrayList con objetos.

Crea una clase Estudiante con atributos: nombre, edad, carrera.

En el main, guarda varios estudiantes en un ArrayList.

Muestra todos los estudiantes.

Busca un estudiante por nombre.

Elimina un estudiante del ArrayList.
 */
public class principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        //int edad, numEstudiante = 0;
        //String nombre, carrera;


        //List<Estudiante> es = new ArrayList<>();


        // AGREGAR NUMERO DE ESTUDIANTES
        System.out.print("Ingrese la cantidad de estudiantes: ");
        estudiante.setNumEstudiante(sc.nextInt());


        // AGREGAR ESTUDIANTES
        estudiante.agregarEstudiante();
        /*for ( int i = 1; i <= estudiante.getNumEstudiante(); i++) {
            System.out.print((i) + ". Ingrese el nombre del estudiante: ");
            nombre = sc.next();

            System.out.print((i) + ". Ingrese la edad del estudiante: ");
            edad = sc.nextInt();

            System.out.print((i) + ". Ingrese la carrera del estudiante: ");
            carrera = sc.next();

            estudiante.agregarEstudiante(nombre, edad, carrera);
            
            System.out.println("\n");

        }*/
        





        /*for ( int i = 1; i <= numEstudiante; i++) {
            System.out.print((i+1) + ". Ingrese el nombre del estudiante: ");
            nombre = sc.next();

            System.out.print((i+1) + ". Ingres la edad del estudiante: ");
            edad = sc.nextInt();

            System.out.print((i+1) + ". Ingrese la carrera del estudiante: ");
            carrera = sc.next();

            es.add(new Estudiante(nombre, edad, carrera));

            System.out.println("\n");
        }*/

        // MOSTRAR ESTUDIANTES
        estudiante.mostrarEstudiantes();
        

        /*es.forEach(estudiante -> {
            System.out.println("Estudainte -> " + estudiante.getNombre());
            System.out.println("Edad -> " + estudiante.getEdad());
            System.out.println("Carrera -> " + estudiante.getCarrera());
        });*/
        
        /*for (int i = 0; i < es.size(); i++) {
            System.out.println("Estudainte " + (i+1));
            System.out.println("Nombre ->" + es.get(i).getNombre());
            System.out.println("Edad -> " + es.get(i).getEdad());
            System.out.println("Carrera -> " + es.get(i).getCarrera());            
            System.out.println("\n");
        }*/


        /*for (Estudiante e : es) {
            System.out.println("Nombre -> " + e.getNombre());
            System.out.println("Edad -> " + e.getEdad());
            System.out.println("Carrera -> " + e.getCarrera());
            System.out.println();
        }*/

        // BUSCAR ESTUDIANTE POR NOMBRE
        estudiante.buscarEstudiante();

        /*System.out.print("\nBuscar estudiante por nombre: ");
        String BuscarEstudiante = sc.next();

        for(Estudiante e: es) {
            if(e.getNombre().equals(BuscarEstudiante)) {
                System.out.println("Estudiante encontrado");
                System.out.println("Nombre -> " + e.getNombre());
                System.out.println("Edad -> " + e.getEdad());
                System.out.println("Carrera -> " + e.getCarrera());
                System.out.println();
            } else {
                System.out.println("Estudiante no encontrado.");
            }
        }*/

        // ELIMINAR ESTUDIANTE
        estudiante.eliminarEstudiante();

        /*System.out.print("\nEliminar estudiante: ");
        BuscarEstudiante = sc.next();

        Iterator<Estudiante> itEstudiante = es.iterator();

        while(itEstudiante.hasNext()) {
            Estudiante estudiante = itEstudiante.next();

            if(estudiante.getNombre().equals(BuscarEstudiante)) {
                System.out.println(estudiante);
                System.out.println();

                itEstudiante.remove();

            } else {
                System.out.println("Estudiante no encontrado.");
            }


        }*/

        
        sc.close();
    }
    
}
