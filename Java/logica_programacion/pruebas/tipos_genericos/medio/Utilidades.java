package tipos_genericos.medio;

import java.util.List;

// Clase con metodo generico para imprimir cualquier lista
public class Utilidades {

    // Metodo generico par aimprimir todos los elementos de una lista
    public static <T> void imprimirLista(List<T> lista) {
        for (T t: lista) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        List<String> nombres = List.of("Juan", "Pedro", "Maria", "Luis");
        List<Integer> numeros = List.of(1, 2, 3, 4);

        Utilidades.imprimirLista(nombres);
        Utilidades.imprimirLista(numeros);

    }


    
}
