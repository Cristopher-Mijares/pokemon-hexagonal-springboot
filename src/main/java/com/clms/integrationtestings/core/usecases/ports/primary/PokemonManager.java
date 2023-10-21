package com.clms.integrationtestings.core.usecases.ports.primary;

import java.util.List;

import com.clms.integrationtestings.core.domain.entities.Pokemon;

public interface PokemonManager {
    List<Pokemon> getAllPokemonsThatEnjoyDanoninos();
    List<Pokemon> getAllPokemonsThatEnjoyDanoninosByType(String pokemonType);
}
