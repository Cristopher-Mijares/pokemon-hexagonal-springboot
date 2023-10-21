package com.clms.integrationtestings.adapters.secondary.database.sql;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;

import com.clms.integrationtestings.core.domain.entities.Pokemon;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class PokemonRepositoryDbImplTest {

    @Autowired
    private PokemonRepositoryDbImpl pokemonRepository;

    @Test
    void testGetAllPokemonsMustReturn5PokemonWithNamePrefixTester() {
        List<Pokemon> testerPokemons = pokemonRepository.getAllPokemons();
        assertEquals(10, testerPokemons.size());
        assertTrue(testerPokemons.get(0).getName().contains("tester"));
    }

    @Test
    void testGetAllPokemonsByTypePlantMustReturn4Pokemons() {
        List<Pokemon> testerPokemons = pokemonRepository.getPokemonsByType("plant");
        assertEquals(4, testerPokemons.size());
        assertTrue(testerPokemons.get(0).getName().contains("tester"));
    }

    @Test
    void testGetAllPokemonsByTypeFireMustReturn3Pokemons() {
        List<Pokemon> testerPokemons = pokemonRepository.getPokemonsByType("fire");
        assertEquals(3, testerPokemons.size());
        assertTrue(testerPokemons.get(0).getName().contains("tester"));
    }

    @Test
    void testGetAllPokemonsByTypeWaterMustReturn3Pokemons() {
        List<Pokemon> testerPokemons = pokemonRepository.getPokemonsByType("water");
        assertEquals(3, testerPokemons.size());
        assertTrue(testerPokemons.get(0).getName().contains("tester"));
    }

    @Test
    void testGetAllPokemonsByTypePepepecasMustReturn0Pokemons() {
        List<Pokemon> testerPokemons = pokemonRepository.getPokemonsByType("pepepecas");
        assertEquals(0, testerPokemons.size());
    }
}
