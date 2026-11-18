package br.com.unicuritiba.appbatalhapokemon;

public class FactoryPartida {

    public Partida criarPartida(){

        FactoryTreinador factoryTreinador = new FactoryTreinador();

        // Sorteia os dois treinadores (cada um já vem com seus pokemons fixos),
        // garantindo que não sejam o mesmo
        Treinador treinador1 = factoryTreinador.getTreinador();
        Treinador treinador2 = factoryTreinador.getTreinador();
        while (treinador2.getNome().equals(treinador1.getNome())) {
            treinador2 = factoryTreinador.getTreinador();
        }

        // Cria a instância da partida com os dois treinadores
        return new Partida(treinador1, treinador2);
    }

}
