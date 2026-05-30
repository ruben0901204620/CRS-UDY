public class EjemploAutomovilRelacionesObjeto {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luis", "martinez");
        AutomovilUmbrella subaru = new AutomovilUmbrella("subaru","Impreza");
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);// subaru.setColor("Blanco");  (Automovil.COLOR_BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBAK);
        subaru.setConductor(conductorSubaru);
        // subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for(int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda( new Rueda("Yokohama", 16, 7.5));
        }

        Persona pedro = new Persona("Pedro", "Lopez");
        AutomovilUmbrella mazda = new AutomovilUmbrella("Mazda","BT-50",Color.GRIS, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pedro);
        // mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for(int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Rueda[] ruedasNissan = new Rueda[5];
        for(int i = 0; i < ruedasNissan.length; i++) {
            ruedasNissan[i] = new Rueda("Pirelli", 22, 11.5);

        }

        Persona raul = new Persona("Raul", "Gonzales");
        AutomovilUmbrella nissan = new AutomovilUmbrella("Nissan", "Navara", Color.AMARILLO,
                new Motor(3.5, TipoMotor.BENCIDA),new Estanque(50), raul, ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = new Rueda[5];
        for(int i = 0; i < ruedasNissan2.length; i++) {
            ruedasNissan2[i] = new Rueda("Pirelli", 22, 11.5);

        }

        Persona lalo = new Persona("Lalo", "Gonzales");
        AutomovilUmbrella nissan2 = new AutomovilUmbrella("Nissan", "Navara", Color.NARANJA,
                new Motor(4.3, TipoMotor.DIESEL), new Estanque(), lalo, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.SEDAN);

        AutomovilUmbrella.setColorPatente(Color.ROJO);
        AutomovilUmbrella auto = new AutomovilUmbrella();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());


        /*System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(Rueda r: subaru.getRuedas()) {
            System.out.println(r.getFabricante() + " Aro: " + r.getAro() + " ancho: " + r.getAncho());
        }*/

    }
}
