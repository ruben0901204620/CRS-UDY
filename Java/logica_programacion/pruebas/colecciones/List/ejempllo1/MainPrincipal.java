/*Crea un programa que permita ingresar nombres de estudiantes y luego los muestre todos.
 El usuario puede seguir agregando nombres hasta que escriba "salir". Después, 
 imprime la lista completa. */

package ejempllo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;

        List<Estudiante> etd = new ArrayList<>();

        while(true) {
            System.out.print("Ingrese un nombre y apellido de estudiante o escriba 'salir' para terminar: ");
            entrada = sc.nextLine();

            if(entrada.contains("salir")) {
                break;
            }

            etd.add(new Estudiante(entrada));

        }

        System.out.println("Lista de Estudiantes agregados: ");

        for (Estudiante mostrar: etd) {
            System.out.println(mostrar);
            
        }

        //etd.forEach(System.out::println);

        sc.close();

    }
    
}
