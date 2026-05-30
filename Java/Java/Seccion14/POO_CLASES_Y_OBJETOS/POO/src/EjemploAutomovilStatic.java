public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);// subaru.setColor("Blanco");  (Automovil.COLOR_BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBAK);


        Automovil mazda = new Automovil("Mazda","BT-50",Color.GRIS, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setCilindrada(3.0);
        // mazda.color = "Rojo";
        System.out.println("mazda.fabricante: " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.AMARILLO, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJA, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.SEDAN);

        Automovil.setColorPatente(Color.ROJO);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        System.out.println("Automovil: " + Automovil.getColorPatente().getColor());
        System.out.println("Kilometros por litro: " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad maxima: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo desc. subaru: " + tipoSubaru.getDescripcion());





    }
}
