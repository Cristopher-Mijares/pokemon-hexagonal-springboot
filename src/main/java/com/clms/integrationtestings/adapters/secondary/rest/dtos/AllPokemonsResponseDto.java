package com.clms.integrationtestings.adapters.secondary.rest.dtos;

import java.io.Serializable;
import java.util.List;

public class AllPokemonsResponseDto implements Serializable {
    Integer count;
    String next;
    List<AllPokemonItemResponse> results;

    public AllPokemonsResponseDto() {
    }

    public AllPokemonsResponseDto(Integer count, String next, List<AllPokemonItemResponse> results) {
        this.count = count;
        this.next = next;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public String getNext() {
        return next;
    }
    public void setNext(String next) {
        this.next = next;
    }
    public List<AllPokemonItemResponse> getResults() {
        return results;
    }
    public void setResults(List<AllPokemonItemResponse> results) {
        this.results = results;
    }

    
}
