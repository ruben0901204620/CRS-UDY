package org.lpz.appPrincipal;

import org.lpz.productos.*;

        public class Almacen {
            public static void main(String[] args) {

                Producto[] productos = new Producto[8];
                productos[0] = new Lacteo("Queso", 20.0, 1, 1150);
                productos[1] = new Lacteo("Leche", 10.0, 2, 987);
                productos[2] = new Fruta("Banano", 10.0, 1.2, "Amarillo");
        productos[3] = new Fruta("Manzana", 5.0, 1.1, "Verde");
        productos[4] = new Limpieza("Cloro", 1.0, "Lysol", 100.0);
        productos[5] = new Limpieza("Desinfectante", 2.50, "Magia", 50.0);
        productos[6] = new NoPerecible("Atun", 15.0, 2, 1000);
        productos[7] = new NoPerecible("Arroz", 5.0, 1, 400);


        for (Producto prd : productos) {
            System.out.println("=============== " + prd.getClass().getSimpleName() + " ===============");
            System.out.println("Nombre: " + prd.getNombre());
            System.out.println("Precio: " + prd.getPrecio());

            if (prd instanceof Lacteo) {
                System.out.println("Cantidad: " + ((Lacteo) prd).getCantidad());
                System.out.println("Proteinas: " + ((Lacteo) prd).getProteinas());
            } else if (prd instanceof Fruta) {
                System.out.println("Peso: " + ((Fruta) prd).getPrecio());
                System.out.println("Color: " + ((Fruta) prd).getColor());
            } else if (prd instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prd).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prd).getLitros());
            } else if (prd instanceof NoPerecible) {
                System.out.println("Contenido: " + ((NoPerecible) prd).getContenido());
                System.out.println("Calorias: " + ((NoPerecible) prd).getCalorias());
            }

        }

    }

}