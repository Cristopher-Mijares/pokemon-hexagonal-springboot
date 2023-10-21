package com.clms.integrationtestings.adapters.secondary.database.sql.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.clms.integrationtestings.adapters.secondary.database.sql.dtos.PokemonDbDto;

@Service()
public interface PokemonsJpaRepository extends JpaRepository<PokemonDbDto, Integer>{
    List<PokemonDbDto> findAllByType(String type);
}
