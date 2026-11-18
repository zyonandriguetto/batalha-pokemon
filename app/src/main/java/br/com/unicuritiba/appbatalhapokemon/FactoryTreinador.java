package br.com.unicuritiba.appbatalhapokemon;

import java.util.ArrayList;
import java.util.Random;

public class FactoryTreinador {

    private static final String URL_SPRITES =
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/showdown/";

    public Treinador getTreinador(){
        ArrayList<Treinador> treinadors = getTreinadores();
        int posicaoAleatoria = new Random().nextInt(treinadors.size());
        return treinadors.get(posicaoAleatoria);
    }

    private ArrayList<Treinador> getTreinadores(){

        ArrayList<Treinador> treinadores = new ArrayList<>();

        Treinador brock = new Treinador("Brock", 15, "Pewter");
        brock.addPokemon(criarPokemon("Onix", Pokemon.TERRA, 70, 80, 90, 95));
        brock.addPokemon(criarPokemon("Geodude", Pokemon.TERRA, 60, 70, 85, 74));
        brock.addPokemon(criarPokemon("Vulpix", Pokemon.FOGO, 55, 60, 50, 37));
        treinadores.add(brock);

        Treinador ash = new Treinador("Ash Ketchum", 10, "Pallet");
        ash.addPokemon(criarPokemon("Pikachu", Pokemon.ELETRICO, 60, 85, 50, 25));
        ash.addPokemon(criarPokemon("Charizard", Pokemon.FOGO, 80, 90, 75, 6));
        ash.addPokemon(criarPokemon("Squirtle", Pokemon.AGUA, 60, 60, 70, 7));
        treinadores.add(ash);

        Treinador misty = new Treinador("Misty", 10, "Cerulean");
        misty.addPokemon(criarPokemon("Staryu", Pokemon.AGUA, 55, 65, 60, 120));
        misty.addPokemon(criarPokemon("Starmie", Pokemon.AGUA, 70, 80, 80, 121));
        misty.addPokemon(criarPokemon("Psyduck", Pokemon.AGUA, 60, 60, 55, 54));
        treinadores.add(misty);

        Treinador gary = new Treinador("Gary", 10, "Pallet");
        gary.addPokemon(criarPokemon("Blastoise", Pokemon.AGUA, 80, 85, 95, 9));
        gary.addPokemon(criarPokemon("Arcanine", Pokemon.FOGO, 85, 95, 75, 59));
        gary.addPokemon(criarPokemon("Alakazam", Pokemon.PSIQUICO, 60, 90, 50, 65));
        treinadores.add(gary);

        return treinadores;
    }

    // numeroPokedex é usado para montar as URLs das imagens (frente e costas)
    private Pokemon criarPokemon(String nome, int elemento, int hp, int ataque, int defesa, int numeroPokedex){
        return new Pokemon(
                nome,
                elemento,
                hp,
                ataque,
                defesa,
                URL_SPRITES + numeroPokedex + ".gif",
                URL_SPRITES + "back/" + numeroPokedex + ".gif"
        );
    }
}
