package com.clms.integrationtestings.adapters.secondary.rest.dtos;

import java.io.Serializable;

public class AllPokemonItemResponse implements Serializable {
    String name;
    String url;
    
    public AllPokemonItemResponse() {

    }

    public AllPokemonItemResponse(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        String[] splitedUrl = this.url.split("/");
        String idString = splitedUrl[(splitedUrl.length -1)];
        return Integer.parseInt(idString);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
