package E01;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private int numEstudiante;

    private static List<Estudiante> es = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    /*@Override
    public String toString() {
        return "Nombre: " + this.nombre 
        + "\n Edad: " + this.edad 
        + "\n Carrera: " + this.carrera;

    }*/

    // METODO PARA AGREGAR ESTUDIANTES
    public void agregarEstudiante() {
         for ( int i = 1; i <= numEstudiante; i++) {
            System.out.print((i) + ". Ingrese el nombre del estudiante: ");
            nombre = sc.next();

            System.out.print((i) + ". Ingrese la edad del estudiante: ");
            edad = sc.nextInt();

            System.out.print((i) + ". Ingrese la carrera del estudiante: ");
            carrera = sc.next();
            
            System.out.println("\n");

            es.add(new Estudiante(nombre, edad, carrera));

        }

    }

    // METODO PARA BUSCAR ESTUDIANTES
    public void buscarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String buscarEstudiante = sc.next();
        boolean encontrado = false;
        
        for(Estudiante e: es) {
            if(e.getNombre().equals(buscarEstudiante)) {
                System.out.println("Estudiante encontrado: ");
                System.out.println("Nombre -> " + e.getNombre());
                System.out.println("Edad -> " + e.getEdad());
                System.out.println("Carrera -> " + e.getCarrera());
                System.out.println();
                encontrado = true;
                break;
            }
            
        }

        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }


    }

    // METODO PARA MOSTRAR TODOS LOS ESTUDIANTES
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes:");
        for (Estudiante e : es) {
            System.out.println(e);
            System.out.println("\n");
        }

    }

    // METODO PARA ELIMINAR ESTUDIANTES
    public void eliminarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante a eliminar: ");
        String eliminarEstudiante = sc.next();
        boolean encontrado = false;
        Iterator<Estudiante> itEstudiante = es.iterator();

        while(itEstudiante.hasNext()) {
            Estudiante estudiante = itEstudiante.next();

            if(estudiante.getNombre().equals(eliminarEstudiante)) {
                System.out.println("Estudiante eliminado");
                System.out.println();

                itEstudiante.remove();
                encontrado = true;
                break;

            } 
            
            if(!encontrado) {
                System.out.println("Estudiante no encontrado.");
            }


        }

        
        
    }

}
