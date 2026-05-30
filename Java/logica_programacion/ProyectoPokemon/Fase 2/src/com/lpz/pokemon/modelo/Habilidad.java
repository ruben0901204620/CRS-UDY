package com.lpz.pokemon.modelo;

public enum Habilidad {
    CABEZA_ROCA("Cabeza roca"),
    MAR_LLAMAS("Mar llamas"),
    ELECTRICIDAD_ESTATICA("Electricidad estatica"),
    TORRENTE("Torrente"),
    POLVO_ESCUDO("Polvo escudo"),
    MUDAR("Mudar");

    public final String habilidad;

    Habilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    @Override
    public String toString() {
        return this.habilidad;
    }

}
