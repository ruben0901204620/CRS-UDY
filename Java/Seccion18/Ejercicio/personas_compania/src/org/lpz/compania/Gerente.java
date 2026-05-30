package org.lpz.compania;

public class Gerente extends Empleado{
    private Double presupuesto = 20000d;

    public Gerente(String nombre, String apellido, String numeroFIscal,String direccion) {
        super(nombre, apellido, numeroFIscal, direccion);
    }

    public Gerente(Double remuneracion) {
        super(remuneracion);
    }

    public void nuevoPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;

    }

}
