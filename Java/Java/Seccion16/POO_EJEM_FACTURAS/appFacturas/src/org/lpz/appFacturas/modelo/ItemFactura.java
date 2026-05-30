package org.lpz.appFacturas.modelo;

public class ItemFactura {
    private int cantidad;
    private Producto producto;

    public ItemFactura(int cantidad, Producto producto) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calculaImporte() {
        return cantidad * getProducto().getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() +
                "\t" + cantidad +
                "\t" + calculaImporte();
    }

}
