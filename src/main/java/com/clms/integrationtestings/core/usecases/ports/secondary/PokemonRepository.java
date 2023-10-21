package com.clms.integrationtestings.core.usecases.ports.secondary;

import java.util.List;

import com.clms.integrationtestings.core.domain.entities.Pokemon;

public interface PokemonRepository {
    List<Pokemon> getAllPokemons();
    List<Pokemon> getPokemonsByType(String pokemonType);
    Pokemon getPokemon();
}
