public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);// subaru.setColor("Blanco");  (Automovil.COLOR_BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBAK);


        Automovil mazda = new Automovil("Mazda","BT-50",Color.GRIS, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante: " + mazda.getFabricante());

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo desc. subaru: " + tipoSubaru.getDescripcion());

        switch (tipoSubaru) {
            case CONVERTIBLE ->
                System.out.println("El automovil es deortivo y descapotable de dos puertas.");
            case COUPE ->
                System.out.println("Es un automivil pequeño de dos puertas y tipicamente deportivo.");
            case HATCHBAK ->
                System.out.println("Es un automovil utilitario de trasnporte, de empersas.");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta.");
            case SEDAN ->
                System.out.println("Es un automovil mediano.");
            case STATION_WAGON ->
                System.out.println("Es un automovil mas grande, con maleta grande..");

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta: tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumPuertas());
            System.out.println();
        }





    }
}
