package com.lpz.pokemon.app;

import com.lpz.pokemon.modelo.Genero;
import com.lpz.pokemon.modelo.Habilidad;
import com.lpz.pokemon.modelo.Pokemon;
import com.lpz.pokemon.modelo.Tipo;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("***************************************");
        Pokemon lairon = new Pokemon("Lairon",
                Tipo.ACERO,
                "Aggron",
                35,
                90,
                8,
                "Metal pesado",
                "Gris",
                Genero.DESCONOCIDO,
                "Pokémon Coraza férrea",
                120.0d,
                0.9d,
                Habilidad.CABEZA_ROCA
        );
        System.out.println(lairon.verDeralle());

        System.out.println("***************************************");
        Pokemon charmander = new Pokemon("Charmander",
                Tipo.FUEGO,
                "Charizard",
                70,
                45,
                6,
                "Montaña",
                "Rojo",
                Genero.MACHO,
                "Pokémon Lagartija",
                8.5d,
                0.6d,
                Habilidad.MAR_LLAMAS
        );
        System.out.println(charmander.verDeralle());

        System.out.println("***************************************");
        Pokemon pikachu = new Pokemon("Pikachu",
                Tipo.ELECTRICO,
                "Raichu",
                70,
                190,
                8,
                "Bosque",
                "Amarillo",
                Genero.DESCONOCIDO,
                "Pokémon Ratón",
                6.0d,
                0.4d,
                Habilidad.ELECTRICIDAD_ESTATICA
        );
        System.out.println(pikachu.verDeralle());

    }

}
