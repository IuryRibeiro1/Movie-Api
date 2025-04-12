package com.movie.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filmes {

    private int id;
    String original_language;
    private String title;


    public Filmes(){

    }

    public Filmes(int id, String original_language, String title) {
        this.id = id;
        this.original_language = original_language;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;

    }

    @Override
    public String toString() {
        return "Filmes: " +
                "id: " + id +
                ", original_language: "  + original_language + '\'' +
                ", title: '" + title + '\'';
    }
}
