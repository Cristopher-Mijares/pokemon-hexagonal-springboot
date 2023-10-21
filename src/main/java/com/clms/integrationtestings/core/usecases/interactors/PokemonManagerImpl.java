package com.clms.integrationtestings.core.usecases.interactors;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.clms.integrationtestings.core.domain.entities.Pokemon;
import com.clms.integrationtestings.core.usecases.ports.primary.PokemonManager;
import com.clms.integrationtestings.core.usecases.ports.secondary.PokemonRepository;

@Service
public class PokemonManagerImpl implements PokemonManager {

    @Autowired
    @Qualifier("PokemonsDbRepository")
    private PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> getAllPokemonsThatEnjoyDanoninos() {
        return this.pokemonRepository.getAllPokemons().stream().map(
            (Pokemon itemPokemon) -> {
                itemPokemon.setName(itemPokemon.getName().concat(" enjoy eating Danoninos :P")); // This line simulates the implementation of a business rule
                return itemPokemon;
            }).collect(Collectors.toList());
    }

    @Override
    public List<Pokemon> getAllPokemonsThatEnjoyDanoninosByType(String pokemonType) {
        return this.pokemonRepository.getPokemonsByType(pokemonType).stream().map(
            (Pokemon itemPokemon) -> {
                itemPokemon.setName(itemPokemon.getName().concat(" enjoy eating Danoninos :P")); // This line simulates the implementation of a business rule
                return itemPokemon;
            }).collect(Collectors.toList());
    }
    
}
