package org.lpz.productos;

public class Lacteo extends Producto {
    int cantidad;
    int proteinas;

    public Lacteo(String nombre,Double precio,int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
