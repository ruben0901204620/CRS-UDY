package com.lpz.pokemon.app;

import com.lpz.pokemon.modelo.*;

public class MainApp {
    public static void main(String[] args) {

        Pokemon[] pokedex = new Pokemon[6];

        pokedex[0] = new Pokemon("Lairon",
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
        pokedex[1] = new Pokemon("Charmander",
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

        pokedex[2] = new Pokemon("Pikachu",
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

        pokedex[3] = new Pokemon("Squirtle",
                Tipo.AGUA,
                "Wartortle",
                70,
                45,
                6,
                "Agua dulce",
                "Azul",
                Genero.MACHO,
                "Pokémon Tortuguita",
                9.0d,
                0.5d,
                Habilidad.TORRENTE
        );

        pokedex[4] = new Pokemon("Caterpie",
                Tipo.BICHO,
                "Metapod",
                70,
                255,
                14,
                "Bosque",
                "Verde",
                Genero.DESCONOCIDO,
                "Pokémon Gusano",
                2.9d,
                0.3d,
                Habilidad.POLVO_ESCUDO
        );

        pokedex[5] = new Pokemon("Dratini",
                Tipo.DRAGON,
                "Dragonair",
                35,
                45,
                2,
                "Agua dulce",
                "Azul",
                Genero.DESCONOCIDO,
                "Pokémon Dragón",
                3.3d,
                1.8d,
                Habilidad.MUDAR
        );

        for(int i = 0; i < pokedex.length; i++) {
            System.out.println("Pokemon #"+(i+1));
            System.out.println(pokedex[i].verDetalle());
            System.out.println("----------------------\n");
        }

    }

}
