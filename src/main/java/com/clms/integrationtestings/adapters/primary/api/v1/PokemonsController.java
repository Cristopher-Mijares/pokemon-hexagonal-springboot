package com.clms.integrationtestings.adapters.primary.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clms.integrationtestings.core.domain.entities.Pokemon;
import com.clms.integrationtestings.core.usecases.ports.primary.PokemonManager;

@RestController
public class PokemonsController {
    @Autowired
    PokemonManager pokemonManager;

    @GetMapping("/pokemons")
    List<Pokemon> all() {
        return pokemonManager.getAllPokemonsThatEnjoyDanoninos();
    }

    @GetMapping("/pokemons/filtered")
    List<Pokemon> allByPokemonType(@RequestParam(required = false) String type) {
        return pokemonManager.getAllPokemonsThatEnjoyDanoninosByType(type);
    }
}
