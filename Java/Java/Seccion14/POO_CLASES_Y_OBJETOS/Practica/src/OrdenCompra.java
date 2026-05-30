import java.util.Date;

public class OrdenCompra {
    private  Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto (Producto producto) {
        int indiceProductos = 0;
        if(indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }













    }

}
