package com.lpz.pokemon.modelo;

public class Pokemon {
    // ***********************************************************************
    // ************************ Atributos del POKEMON ************************
    // ***********************************************************************

    private String nombre;
    private Tipo tipo;
    private Habilidad habilidades;
    private double altura;
    private double peso;
    private String especie;
    private Genero genero;
    private String color;
    private String habitad;
    private int figura;
    private float ratioCaptura;
    private int amistadBase;
    private String evolucion;

    // *************************************************************************
    // ************************ Constructor del POKEMON ************************
    // *************************************************************************

    public Pokemon(
            String nombre,
            Tipo tipo,
            String evolucion,
            int amistadBase,
            float ratioCaptura,
            int figura,
            String habitad,
            String color,
            Genero genero,
            String especie,
            double peso,
            double altura,
            Habilidad habilidades

    ) {
        this.nombre = nombre;
        this.evolucion = evolucion;
        this.amistadBase = amistadBase;
        this.ratioCaptura = ratioCaptura;
        this.figura = figura;
        this.habitad = habitad;
        this.color = color;
        this.genero = genero;
        this.especie = especie;
        this.peso = peso;
        this.altura = altura;
        this.habilidades = habilidades;
        this.tipo = tipo;
    }

    // *******************************************************************
    // ************************ Metodos Get y Set ************************
    // *******************************************************************

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Habilidad getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidad habilidades) {
        this.habilidades = habilidades;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    public float getRatioCaptura() {
        return ratioCaptura;
    }

    public void setRatioCaptura(float ratioCaptura) {
        this.ratioCaptura = ratioCaptura;
    }

    public int getAmistadBase() {
        return amistadBase;
    }

    public void setAmistadBase(int amistadBase) {
        this.amistadBase = amistadBase;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String verDeralle() {
        return "nombre: " + nombre
                + "\ntipo: " + tipo
                + "\nhabilidades: " + habilidades
                + "\naltura: " + altura +"m"
                + "\npeso: " + peso + "Kg"
                + "\nespecie: " + especie
                + "\ngenero: " + genero
                + "\ncolor: " + color
                + "\nhabitad: " + habitad
                + "\nfigura: " + figura
                + "\nratioCaptura: " + ratioCaptura
                + "\namistadBase: " + amistadBase
                + "\nevolucion: " + evolucion;
    }

    public void evolucionar() {

    }

    
}
