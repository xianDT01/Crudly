package com.DuranRecMovies.DuranRecMovies.controller;

import com.DuranRecMovies.DuranRecMovies.model.Movie;
import com.DuranRecMovies.DuranRecMovies.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MovieRepository movieRepository;

    public DataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Cargar datos iniciales
        movieRepository.save(new Movie("Inception", "Sci-Fi", 2010, "A mind-bending thriller", 8.8));
        movieRepository.save(new Movie("The Shawshank Redemption", "Drama", 1994, "A story of hope", 9.3));

    }
}
