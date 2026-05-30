package org.lpz.compania;

public class Cliente extends Persona {
    private int clienteId;

    public Cliente(int clienteId,String numeroFiscal,String nombre, String apellido, String direccion) {
        super(numeroFiscal,nombre, apellido, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return  clienteId;
    }


    @Override
    public String toString() {

        return "\n========== Datos del cliente ==========\n" +
                "IDcliente: " + getClienteId() +
                "\nNombre Cliente: " + getNombre() +
                "\napellido cliente: " + getApellido() +
                "\nDireccion cliente: " + getDireccion();
    }
}
