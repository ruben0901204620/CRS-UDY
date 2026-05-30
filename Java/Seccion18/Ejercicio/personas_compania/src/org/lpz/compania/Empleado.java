package org.lpz.compania;

    public class Empleado extends Persona {
    private Double remuneracion = 3750d;
    private int empleadoId;

    public Empleado() {

    }

    public Empleado(String nombre, String apellido, String numeroFIscal,String direccion) {
        super(nombre, apellido,numeroFIscal, direccion);
    }

    public Empleado(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public Double aumentarRemuneracion(int porcentaje) {
        return this.remuneracion + (this.remuneracion * (porcentaje / 100));
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return  empleadoId;
    }

        @Override
        public String toString() {
            return "\n========== Datos del empleado ==========\n" +
                    "IDempleado: " + getEmpleadoId() +
                    "\nNombre empleado: " + getNombre() +
                    "\napellido empleado: " + getApellido() +
                    "\nDireccion empleado: " + getDireccion() +
                    "\n remuneracion: " + remuneracion +
                    "\n nueva remuneracion: " + aumentarRemuneracion(10);

        }


    }
