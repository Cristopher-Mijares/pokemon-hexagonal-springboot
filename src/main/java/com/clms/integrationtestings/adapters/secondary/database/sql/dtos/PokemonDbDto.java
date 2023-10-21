package com.clms.integrationtestings.adapters.secondary.database.sql.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemons")
public class PokemonDbDto {
    @Id
    @Column(name = "pokemon_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    @Column(name = "pokemon_name")
    private String name;

    @Column(name = "pokemon_url_image")
    private String urlImage;

    @Column(name = "pokemon_type")
    private String type;

    public PokemonDbDto() {

    }

    public PokemonDbDto(Integer id, String name, String urlImage, String type) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }    
}
