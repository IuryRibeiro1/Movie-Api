package com.movie.api;

import com.movie.api.services.MovieService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println();


    MovieService movieService = new MovieService();

        try {
            System.out.println(movieService.getFilme());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

}