package factura;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_items = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_items];
        this.folio = folio;
        this.fecha = new Date();

    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura items) {
        if(indiceItems < MAX_items) {
            this.items[indiceItems++] = items;
        }

    }

    public float calcularTotal() {
        float total = 0.0f;
        for(int i = 0; i < indiceItems; i++) {
            total += items[i].calcularImporte();
        }

        return total;
    }



    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura no. ");
        sb.append(folio)
            .append("\ncliente: ")
            .append(cliente.getNonbre())
            .append("\nNIF")
            .append(cliente.getNit())
            .append("\ndescripcion")
            .append(descripcion)
            .append("\n");


        SimpleDateFormat df = new SimpleDateFormat("dd ' de ' MMMM, YYYY");
        sb.append("Fecha Emision")
            .append(df.format(fecha))
            .append("\n")
            .append("\n#Nombre\tQ\tCant.\tTotal\n");

        for(int i = 0; i < indiceItems; i++) {
            sb.append(items[i].toString())
            .append("\n");

        }

        sb.append("\nGran Total")
        .append(calcularTotal());




            return sb.toString();

    }

    @Override
        public String toString() {
            return generarDetalle();
        }













    
}
