package tipos_genericos;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> trasnporteCaballos = new Camion<>(3);
        trasnporteCaballos.add(new Animal("Peregrino", "Caballo"));
        trasnporteCaballos.add(new Animal("Grillo", "Caballo"));
        trasnporteCaballos.add(new Animal("Epona", "Caballo"));

        imprimirTransporte.imprimirCamion(trasnporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horquilla"));
        transMaquinas.add(new Maquinaria("perforadora"));

        imprimirTransporte.imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));
        imprimirTransporte.imprimirCamion(transAuto);


    }
}