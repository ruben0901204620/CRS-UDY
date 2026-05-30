package com.lpz.pokemon.modelo;

public enum Genero {
    MACHO("Macho"),
    HEMBRA("Hembra"),
    DESCONOCIDO("Desconocido");

    public final String genero;


    Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return this.genero;
    }

}
