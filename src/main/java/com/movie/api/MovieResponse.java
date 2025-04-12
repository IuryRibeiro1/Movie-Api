package com.movie.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.movie.api.entities.Filmes;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieResponse {
    private List<Filmes> results;

    public List<Filmes> getResults() {
        return results;
    }
}