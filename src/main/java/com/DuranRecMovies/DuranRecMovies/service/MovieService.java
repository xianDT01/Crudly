package com.DuranRecMovies.DuranRecMovies.service;


import com.DuranRecMovies.DuranRecMovies.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    // Esta es solo una lista de ejemplo, en un caso real, deberías conectar a una base de datos
    private List<Movie> movies = new ArrayList<>();

    public MovieService() {
        // Agrega algunas películas de ejemplo
        movies.add(new Movie("Inception", "Un ladrón que roba secretos a través de los sueños.", 2010, "Ciencia Ficción", 8.8));
        movies.add(new Movie("The Godfather", "La historia de la familia Corleone.", 1972, "Drama", 9.2));
        // Agrega más películas si lo deseas
    }

    public List<Movie> getAllMovies() {
        return movies; // Devuelve la lista de películas
    }
}
