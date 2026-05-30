package org.lpz.modelo;

import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int indiceProducto;
    public static int ultimoId;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto (Producto producto) {
        if(indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = producto;
        }

    }

    public float granTotal() {
        float total = 0;
        for(Producto p: productos) {
            total += p.getPrecio();
        }

        return total;
    }







}
