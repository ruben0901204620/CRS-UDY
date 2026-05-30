package org.lpz.pooherencia;

public class Alumno extends Persona{
    private String instituto;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alumno: inicializando contructor...");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto) {
        super(nombre, apellido, edad);
        this.instituto = instituto;
    }

    public Alumno(String nombre, String apellido, int edad, String intitutom,
                  double notaMatematica, double notaLenguaje, double notaHistoria) {
        this(nombre, apellido, edad);
        this.notaMatematica = notaMatematica;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar +  " Soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio() {
        return (notaHistoria + notaLenguaje + notaMatematica)/3;
    }

    @Override
    public String toString() {
        return  super.toString() + "\ninstituto='" + instituto + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaLenguaje=" + notaLenguaje +
                ", notaHistoria=" + notaHistoria +
                ", promedio=" + calcularPromedio();
    }

}
