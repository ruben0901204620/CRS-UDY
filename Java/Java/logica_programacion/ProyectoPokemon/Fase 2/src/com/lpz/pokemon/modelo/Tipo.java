package com.lpz.pokemon.modelo;

public enum Tipo {
    PLANTA("Planta"),
    VENENO("Veneno"),
    FUEGO("Fuego"),
    VOLADOR("Volador"),
    AGUA("Agua"),
    BICHO("Bicho"),
    NORMAL("Normal"),
    ELECTRICO("Electrico"),
    TIERRA("Tierra"),
    HADA("Hada"),
    LUCHA("Lucha"),
    PSIQUICO("Psiquico"),
    ACERO("Acero"),
    HIELO("Hielo"),
    DRAGON("Dragon");

    private final String tipo;

    Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return this.tipo;
    }

}
