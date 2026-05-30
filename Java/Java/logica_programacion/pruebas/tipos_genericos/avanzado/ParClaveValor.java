package tipos_genericos.avanzado;


// Clase genérica con dos parámetros de tipo y una restricción (bound)
public class ParClaveValor<K, V extends Number> {
    private K clave;
    private V valor;

    public ParClaveValor(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    // Método que usa los métodos de la clase Number (como doubleValue)
    public double valorDouble() {  
        return valor.doubleValue();
    }


    public static void main(String[] args) {
        ParClaveValor<String, Integer> par1 = new ParClaveValor<String,Integer>("Edad", 24);
        ParClaveValor<String, Double> par2 = new ParClaveValor<String,Double>("altura", 1.73);

        System.out.println("Par1 -> " + par1.getClave() + " " + par1.getValor());
        System.out.println("Par2 -> " + par2.getClave() + " " + par2.getValor());
        System.out.println("Valor double de par1: " + par1.valorDouble());
        System.out.println("Valor double de par2: " + par2.valorDouble());


    }

    
}
