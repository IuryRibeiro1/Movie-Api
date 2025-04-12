package com.movie.api.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movie.api.MovieResponse;
import com.movie.api.entities.Filmes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class MovieService {

    Filmes filme = new Filmes();

    public Filmes getFilme() throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.themoviedb.org/3/discover/movie?api_key=be5a0ec464ad9a8d8661ca6443df989e"))
                .build();

        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        MovieResponse responseObj = mapper.readValue(response.body(), MovieResponse.class);

        if (responseObj.getResults() != null && !responseObj.getResults().isEmpty()) {
            return responseObj.getResults().get(0); // Retorna o primeiro filme
        } else {
            throw new RuntimeException("Nenhum filme encontrado na resposta da API.");
        }
    }

}
