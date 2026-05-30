import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luis", "martinez");
        AutomovilUmbrella subaru = new AutomovilUmbrella("subaru","Impreza");
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);// subaru.setColor("Blanco");  (Automovil.COLOR_BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBAK);
        subaru.setConductor(conductorSubaru);

        Persona conductorMazda = new Persona("Pedro", "Lopez");
        AutomovilUmbrella mazda = new AutomovilUmbrella("Mazda","BT-50",Color.GRIS, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);

        Persona conductorNissan = new Persona("Raul", "Gonzales");
        AutomovilUmbrella nissan = new AutomovilUmbrella("Nissan", "Navara", Color.AMARILLO,
                new Motor(3.5, TipoMotor.BENCIDA),new Estanque(50));
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = new Rueda[5];
        for(int i = 0; i < ruedasNissan2.length; i++) {
            ruedasNissan2[i] = new Rueda("Pirelli", 22, 11.5);

        }

        Persona lalo = new Persona("Lalo", "Gonzales");
        AutomovilUmbrella suzuki = new AutomovilUmbrella("Suzuki", "Vitara", Color.NARANJA,
                new Motor(4.3, TipoMotor.DIESEL), new Estanque(), lalo, ruedasNissan2);
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SEDAN);
        AutomovilUmbrella.setColorPatente(Color.ROJO);

        AutomovilUmbrella audi = new AutomovilUmbrella("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        AutomovilUmbrella[] autos = new AutomovilUmbrella[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (AutomovilUmbrella auto : autos) {
            System.out.println(auto);
        }

        System.out.println(subaru.getRuedas());





    }
}
