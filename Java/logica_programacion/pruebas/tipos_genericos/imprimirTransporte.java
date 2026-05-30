package tipos_genericos;


public class imprimirTransporte{

    public static <T> void imprimirCamion(Camion<T> camion) {
        for(T t : camion) {
            if (t instanceof Animal) {
                Animal a = (Animal) t;
                System.out.println(a.getNombre() + " tipo: " + a.getTipo());
            } else if (t instanceof Maquinaria) {
                Maquinaria m = (Maquinaria) t;
                System.out.println(m.getTipo());
            } else if (t instanceof Automovil) {
                Automovil a = (Automovil) t;
                System.out.println(a.getMarca());
                
            }

            
        }

    }


    
}
    

