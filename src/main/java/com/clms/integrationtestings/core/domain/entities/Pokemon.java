package com.clms.integrationtestings.core.domain.entities;

public class Pokemon {
    private Integer id;
    private String name;
    private String urlImage;
    private String type;

    public Pokemon(Integer id, String name, String urlImage, String type) {
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

    @Override
    public String toString() {
        return "Pokemon [id=" + id + ", name=" + name + ", urlImage=" + urlImage + "]";
    }
}