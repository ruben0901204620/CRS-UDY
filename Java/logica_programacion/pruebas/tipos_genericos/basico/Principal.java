package tipos_genericos.basico;

public class Principal {
    public static void main(String[] args) {
        Caja<String> caja = new Caja<>();
        caja.serContenido("Zapato");
        System.out.println("Caja: " +caja.getContenido());

        Caja<Integer> caja2 = new Caja<>();
        caja2.serContenido(10);
        System.out.println("Caja2: " + caja2.getContenido());



    }
    
}
