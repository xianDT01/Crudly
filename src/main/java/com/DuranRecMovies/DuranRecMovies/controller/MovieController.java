package com.DuranRecMovies.DuranRecMovies.controller;

import com.DuranRecMovies.DuranRecMovies.model.Movie;
import com.DuranRecMovies.DuranRecMovies.repository.MovieRepository;
import com.DuranRecMovies.DuranRecMovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class MovieController {

    private final MovieService movieService;
    @Autowired
    private MovieRepository movieRepository;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "index";
    }


    @GetMapping("/movies")
    public String listMovies(Model model) {
        model.addAttribute("movies", movieRepository.findAll());
        return "movies";
    }

    @GetMapping("/movies/{id}")
    public String movieDetail(@PathVariable Long id, Model model) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid movie Id:" + id));
        model.addAttribute("movie", movie);
        return "movieDetail";
    }
}
