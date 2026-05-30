import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        funcionArreglo numeroArreglo = new funcionArreglo(entrada.nextInt());

        int aumento = numeroArreglo.getTamaño();
         
        for(int i = 0; i < aumento; i++) {

            /*System.out.print( (i+1) +". Ingrese la posicion del arreglo: ");
            int posicion = entrada.nextInt(); */

            System.out.print("Ingrese el valor para la posicion ["+i+"]: ");
            int valor = entrada.nextInt(); 
            numeroArreglo.llenarArreglo(i,valor);
            
        }
        
        
        numeroArreglo.mostrarArreglo();
        
        entrada.close();

    }
}