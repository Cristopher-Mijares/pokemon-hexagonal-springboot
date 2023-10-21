package com.clms.integrationtestings.adapters.secondary.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.clms.integrationtestings.adapters.secondary.rest.dtos.AllPokemonItemResponse;
import com.clms.integrationtestings.adapters.secondary.rest.dtos.AllPokemonsResponseDto;
import com.clms.integrationtestings.core.domain.entities.Pokemon;
import com.clms.integrationtestings.core.usecases.ports.secondary.PokemonRepository;

@Service("PokemonsApiRestRepository")
public class PokemonRepositoryRestImpl implements PokemonRepository {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Pokemon> getAllPokemons() {
        AllPokemonsResponseDto responseAllPokemons = restTemplate.getForObject(
            "https://pokeapi.co/api/v2/pokemon/", AllPokemonsResponseDto.class
        );
        List<Pokemon> pokemons = new ArrayList<>();
        String urlImags = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
        responseAllPokemons.getResults().stream().forEach((AllPokemonItemResponse itemPokemon) -> {
            pokemons.add(
                new Pokemon(
                    itemPokemon.getId(), 
                    itemPokemon.getName(),
                    urlImags.concat(itemPokemon.getId().toString()),
                    ""
                )
            );
        });
        return pokemons;
    }

    @Override
    public Pokemon getPokemon() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Pokemon> getPokemonsByType(String pokemonType) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
