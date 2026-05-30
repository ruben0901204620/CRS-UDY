package org.lpz.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion) {
        for(T a: camion) {
            if(a instanceof Animal) {
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());

            } else if (a instanceof Automovil) {
                System.out.println(((Automovil)a).getMarca());

            } else if(a instanceof  Maquinaria) {
                System.out.println(((Maquinaria)a).getTipo());
            }
        }

    }

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);

        /*for(Animal o: transporteCaballos) { //for(Object o: transporteCaballos)
            //Animal a = (Animal) o;
            //System.out.println(a.getNombre() + " tipo: " + a.getTipo());
            System.out.println(o.getNombre() + " tipo: " + o.getTipo());

        } */

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horquilla"));
        transMaquinas.add(new Maquinaria("perforadora"));

        imprimirCamion(transMaquinas);

        /*for(Maquinaria a: transMaquinas) {
            System.out.println(a.getTipo());

        }*/


        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuto);

        /*for(Automovil a: transAuto) {
            System.out.println(a.getMarca());

        }*/


    }
}
