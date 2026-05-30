package tipos_genericos.basico.ejercicio1;

import java.util.Scanner;

public class Pila<T> {
    private Object[] pila;
    private int tamanio;
    private int tope;
 

    public Pila(int tamanio) {
        this.tamanio = tamanio;
        this.pila = new Object[this.tamanio];
        this.tope = -1;
    }

    public void agregar(T elemento) {
        if(tope < tamanio - 1) {
            tope++;
            pila[tope] = elemento;
            System.out.println("Agregando elemento: " + elemento);
        } else {
            System.out.println("Pila llena.");
        }
        
    }

    public T eliminar() {
        if (tope >= 0) {
            T elemento = (T) pila[tope];
            pila[tope] = null; // Limpiar referencia
            tope--;
            return elemento;
        } else {
            System.out.println("La pila está vacía");
            return null;
        }
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tamanio de la pila: ");
        Pila<Integer> pila = new Pila<>(entrada.nextInt());

        pila.agregar(10);
        pila.agregar(20);
        pila.agregar(30);

        





        entrada.close();



    }

    


    
}
