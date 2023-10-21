package com.clms.integrationtestings.adapters.secondary.database.sql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clms.integrationtestings.adapters.secondary.database.sql.daos.PokemonsJpaRepository;
import com.clms.integrationtestings.adapters.secondary.database.sql.dtos.PokemonDbDto;
import com.clms.integrationtestings.core.domain.entities.Pokemon;
import com.clms.integrationtestings.core.usecases.ports.secondary.PokemonRepository;

@Service("PokemonsDbRepository")
public class PokemonRepositoryDbImpl implements PokemonRepository {

    @Autowired
    private PokemonsJpaRepository pokemonsJpaRepository;

    @Override
    public List<Pokemon> getAllPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemonsJpaRepository.findAll().stream().forEach((PokemonDbDto itemPokemon) -> {
            pokemons.add(new Pokemon(itemPokemon.getId(), itemPokemon.getName(), itemPokemon.getUrlImage(), itemPokemon.getType()));
        });
        return pokemons;
    }

    @Override
    public List<Pokemon> getPokemonsByType(String pokemonType) {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemonsJpaRepository.findAllByType(pokemonType).stream().forEach((PokemonDbDto itemPokemon) -> {
            pokemons.add(new Pokemon(itemPokemon.getId(), itemPokemon.getName(), itemPokemon.getUrlImage(), itemPokemon.getType()));
        });
        return pokemons;
    }

    @Override
    public Pokemon getPokemon() {
        // TODO Auto-generated method stub
        return null;
    }
}
