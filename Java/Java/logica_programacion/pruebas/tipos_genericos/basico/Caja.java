package tipos_genericos.basico;

public class Caja<T> {
    private T contenido;

    public void serContenido(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }   
    
}
